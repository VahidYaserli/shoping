package com.elek.elektronika.dao.entity;

import com.elek.elektronika.model.CartDto;

public class Cart {

    private TabletsEntity tabletsEntity;
    private MobilEntity mobilEntity;
    private AccessoriesEntity accessoriesEntity;
    private int quantity;
    private Cart[] carts;
//    private CartDto cartDto;
//    private int quantity;
//    private Cart[] carts;
//
//    public Cart() {
//    }
//
//    public Cart(CartDto cartDto, int quantity) {
//        this.cartDto = cartDto;
//        this.quantity = quantity;
//    }
//    public CartDto getCartDto() {
//        return cartDto;
//    }
//    public void setCartDto(CartDto cartDto) {
//        this.cartDto = cartDto;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public Cart() {
    }

    public Cart(TabletsEntity tabletsEntity, MobilEntity mobilEntity, AccessoriesEntity accessoriesEntity, int quantity) {
        this.tabletsEntity = tabletsEntity;
        this.mobilEntity = mobilEntity;
        this.accessoriesEntity = accessoriesEntity;
        this.quantity = quantity;
    }

    public Cart(TabletsEntity tabletsEntity, int quantity) {

        this.tabletsEntity = tabletsEntity;
        this.quantity = quantity;
    }

    public Cart(MobilEntity mobilEntity, int quantity) {

        this.mobilEntity = mobilEntity;
        this.quantity = quantity;
    }

    public Cart(AccessoriesEntity accessoriesEntity, int quantity) {

        this.accessoriesEntity = accessoriesEntity;
        this.quantity = quantity;
    }

    public TabletsEntity getTabletsEntity() {
        return tabletsEntity;
    }

    public void setTabletsEntity(TabletsEntity tabletsEntity) {
        this.tabletsEntity = tabletsEntity;
    }

    public MobilEntity getMobilEntity() {
        return mobilEntity;
    }

    public void setMobilEntity(MobilEntity mobilEntity) {
        this.mobilEntity = mobilEntity;
    }

    public AccessoriesEntity getAccessoriesEntity() {
        return accessoriesEntity;
    }

    public void setAccessoriesEntity(AccessoriesEntity accessoriesEntity) {
        this.accessoriesEntity = accessoriesEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" + "tabletsEntity=" + tabletsEntity + ", mobilEntity=" + mobilEntity + ", accessoriesEntity=" + accessoriesEntity + ", quantity=" + quantity + '}';
    }

}
