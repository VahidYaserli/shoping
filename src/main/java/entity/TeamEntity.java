

package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="team")
public class TeamEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTeam;
    @Column(name = "picture")
    private String picture;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "description")
    private String description;

    public TeamEntity() {
    }

    public TeamEntity(Integer IdTeam, String picture, String name, String surname, String description) {
        this.IdTeam = IdTeam;
        this.picture = picture;
        this.name = name;
        this.surname = surname;
        this.description = description;
    }

    public Integer getIdTeam() {
        return IdTeam;
    }

    public void setIdTeam(Integer IdTeam) {
        this.IdTeam = IdTeam;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    
    
}
