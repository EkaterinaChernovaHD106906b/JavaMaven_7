package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultServiceTest {
    FilmsItem first = new FilmsItem(45, "Bloodshot", 1);
    FilmsItem second = new FilmsItem(78, "Onward", 2);
    FilmsItem third = new FilmsItem(32, "HotelBelgrade", 3);
    FilmsItem fourth = new FilmsItem(120, "Gentlemen", 4);
    FilmsItem fifth = new FilmsItem(345, "InvisibleMan", 5);
    FilmsItem sixth = new FilmsItem(231, "Trolls", 6);
    FilmsItem seventh = new FilmsItem(144, "NumberOne", 7);

    @Test
    public void myTest() {
        FilmsManager manager = new FilmsManager();
        manager.add(first);
        FilmsItem[] actual = manager.findAll();
        FilmsItem[] expected = {first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest2() {
        FilmsManager manager = new FilmsManager();
        manager.add(first);
        manager.add(second);
        manager.findAll();
        FilmsItem[] actual = manager.findAll();
        FilmsItem[] expected = {first, second};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest3() {
        FilmsManager manager = new FilmsManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.findLast2();
        FilmsItem[] actual = manager.findLast2();
        FilmsItem[] expected = {fifth, fourth, third, second, first, seventh, sixth, fifth, fourth, third};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void myTest4() {
        FilmsManager manager = new FilmsManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.findLast2();
        FilmsItem[] actual = manager.findLast2();
        FilmsItem[] expected = {fifth, fourth, third, second, first,};
        Assertions.assertArrayEquals(expected, actual);

    }

}



