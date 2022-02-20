package com.example.lesson14.model.data;

import com.example.lesson14.model.BookModel;
import com.example.lesson14.model.BookModel;

import java.util.ArrayList;

public class BookClient {
    public static ArrayList<BookModel> list = new ArrayList<>();

    public static ArrayList<BookModel> getBook() {
        list.add(new BookModel("машина", ""));
        list.add(new BookModel("что", ""));
        list.add(new BookModel("а", ""));
        list.add(new BookModel("м", ""));
        list.add(new BookModel("и", ""));
        list.add(new BookModel("п", ""));
        list.add(new BookModel("а", ""));
        list.add(new BookModel("п", ""));
        list.add(new BookModel("ц", ""));
        list.add(new BookModel("л", ""));
        list.add(new BookModel("4", ""));
        list.add(new BookModel("н", ""));
        list.add(new BookModel("р", ""));
        list.add(new BookModel("р", ""));
        list.add(new BookModel("ц", ""));
        list.add(new BookModel("л", ""));
        list.add(new BookModel("т", ""));
        list.add(new BookModel("ь", ""));
        list.add(new BookModel("ж", ""));

        return list;
    }
}