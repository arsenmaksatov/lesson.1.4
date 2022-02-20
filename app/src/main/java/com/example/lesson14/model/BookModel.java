package com.example.lesson14.model;

import java.io.Serializable;

public class BookModel implements Serializable {
    private String name;
    private String description;


    public BookModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
