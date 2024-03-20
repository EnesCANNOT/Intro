package com.etiya;

public class Category {
    private int id;
    String categoryName;

    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public Category(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
