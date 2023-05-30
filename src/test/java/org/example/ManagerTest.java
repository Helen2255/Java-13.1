package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Product book1 = new Book(2, "Оно", 1500, "Стивен Кинг");
    Product book2 = new Book(3, "Теория Вероятности", 800, "Стивен Хокинг");
    Product book3 = new Book(3, "Зов Ктулху", 100, "Говард Лавкрафт");

    Product smartphone = new Smartphone(1, "Redmi 10c", 5_000, "Xiaomi");

    Product[] products = new Product[]{book1, book2};
    Repository repository = new Repository(products);
    Manager manager = new Manager(repository);

    @Test
    void add() {
        manager.add(smartphone);

        Product[] expected = {book1, book2, smartphone};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchBy1() {
        Product[] actual = manager.searchBy("Оно");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void searchBy2() {
        manager.add(book3);

        Product[] actual = manager.searchBy("Оно");
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void searchByNone() {
        Product[] actual = manager.searchBy("фаренгейт");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

/*    @Test
    void matches() {
    }*/
}
