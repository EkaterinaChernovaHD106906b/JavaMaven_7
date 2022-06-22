package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        FilmsItem first = new FilmsItem(45, "Bloodshot", 1);
        FilmsItem second = new FilmsItem(78, "Onward", 2);
        FilmsItem third = new FilmsItem(32, "HotelBelgrade", 3);
        FilmsItem fourth = new FilmsItem(120, "Gentlemen", 4);
        FilmsItem fifth = new FilmsItem(345, "InvisibleMan", 5);
        FilmsItem sixth = new FilmsItem(231, "Trolls", 6);
        FilmsItem seventh = new FilmsItem(144, "NumberOne", 7);

        FilmsManager manager = new FilmsManager();
        manager.findLast2();


    }

}
