package com.elek.elektronika.model;

public class AboutDto {

    private String picture;
    private String text;

    public AboutDto() {
    }

    public AboutDto(String picture, String text) {
        this.picture = picture;
        this.text = text;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    

}
