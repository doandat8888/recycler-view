package com.example.recyclerview;

public class Blog {
    private int imageViewSrc;
    private String title;
    private String description;
    private String descriptionFull;

    public Blog(int imageViewSrc, String title, String description, String descriptionFull) {
        this.imageViewSrc = imageViewSrc;
        this.title = title;
        this.description = description;
        this.descriptionFull = descriptionFull;
    }

    public int getImageViewSrc() {
        return imageViewSrc;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionFull() { return  descriptionFull; }
}
