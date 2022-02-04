
package entity;

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
private Integer Id;
@Column(name = "picture")
private String picture;
private String text;

    public AboutEntity() {
    }

    public AboutEntity(Integer Id, String picture, String text) {
        this.Id = Id;
        this.picture = picture;
        this.text = text;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
