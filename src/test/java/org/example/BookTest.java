package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book = new Book(2, "Оно", 1500, "Стивен Кинг");

    @Test
    void getId() {

        int expected = book.getId();
        int actual = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getName() {

        String expected = book.getName();
        String actual = "Оно";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPrice() {

        int expected = book.getPrice();
        int actual = 1500;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getManufacturer() {

        String expected = book.getAuthor();
        String actual = "Стивен Кинг";

        Assertions.assertEquals(expected, actual);
    }
}
