
package com.elek.elektronika.model;


public class TabletDto {
    
    private String name;
    private Float price;
    private String picture;
    private String currency;

    public TabletDto() {
    }

    public TabletDto(String name, Float price, String picture, String currency) {
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    
   

   
    
    
    
    
}
