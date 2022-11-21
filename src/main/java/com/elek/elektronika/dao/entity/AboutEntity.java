
package com.elek.elektronika.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="about")
public class AboutEntity {
   
@Id  
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(name = "picture")
private String picture;
private String text;

    public AboutEntity() {
    }

    public AboutEntity(Integer id, String picture, String text) {
        this.id = id;
        this.picture = picture;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
