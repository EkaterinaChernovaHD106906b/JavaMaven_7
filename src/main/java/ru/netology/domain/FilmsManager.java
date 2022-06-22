package ru.netology.domain;

public class FilmsManager {


    private FilmsItem[] items = new FilmsItem[0];
    private int amountFilms = 10;

    public FilmsManager(int amountFilms) {
        this.amountFilms = amountFilms;
    }

    public FilmsManager() {
        amountFilms = 10;
    }

    public void add(FilmsItem item) {
        int length = items.length + 1;
        FilmsItem[] tmp = new FilmsItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmsItem[] findAll() {
        return items;
    }


    public FilmsItem[] findLast2() {
        int resultLength = 0;
        for (int i = 0; i < items.length; i++) {
            if (items.length >= amountFilms) {
                resultLength = amountFilms;
            } else {
                resultLength = items.length;
            }
        }
        FilmsItem[] result = new FilmsItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}





