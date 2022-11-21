package com.elek.elektronika.model;


public class MobilDto {
    
    private Integer id;
    private String name;
    private Double price;
    private String picture;
    private String currency;

    public MobilDto() {
    }

    public MobilDto(Integer id, String name, Double price, String picture, String currency) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.currency = currency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    @Override
    public String toString() {
        return "MobilDto{" + "id=" + id + ", name=" + name + ", price=" + price + ", picture=" + picture + ", currency=" + currency + '}';
    }

   
    
    
    
    
    
    
}
