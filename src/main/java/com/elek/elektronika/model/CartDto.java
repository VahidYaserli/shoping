package com.elek.elektronika.model;

public class CartDto {
    
private String name;
private Double price;
private String picture;
private String currency;
private String productType;

    public CartDto() {
        
    }

    public CartDto(String name, Double price, String picture, String currency, String productType) {
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.currency = currency;
        this.productType = productType;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

   




    
}
