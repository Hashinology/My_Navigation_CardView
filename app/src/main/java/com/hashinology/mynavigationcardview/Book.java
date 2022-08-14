package com.hashinology.mynavigationcardview;

public class Book {
    private String author;
    private String description;
    private int imgID;



    public Book(String author, String description, int imgID) {
        this.author = author;
        this.description = description;
        this.imgID = imgID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }
}
