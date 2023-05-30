package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1, "Redmi 10c", 5_000, "Xiaomi");
    @Test
    void getId() {

        int expected = smartphone.getId();
        int actual = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getName() {

        String expected = smartphone.getName();
        String actual = "Redmi 10c";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPrice() {

        int expected = smartphone.getPrice();
        int actual = 5_000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getManufacturer() {

        String expected = smartphone.getManufacturer();
        String actual = "Xiaomi";

        Assertions.assertEquals(expected, actual);
    }
}
