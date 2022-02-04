
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="accessories")
public class AccessoriesEntity {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Float price;
    @Column(name = "picture")
    private String picture;
    @Column(name = "currency")
    private String currency;

    public AccessoriesEntity() {
    }

    public AccessoriesEntity(Integer Id, String name, Float price, String picture, String currency) {
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.currency = currency;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
