package com.elek.elektronika.model;


public class TeamDto {
    
    private Integer idTeam;
    private String picture;
    private String name;
    private String surname;
    private String description;

    public TeamDto() {
    }

    public TeamDto(Integer idTeam, String picture, String name, String surname, String description) {
        this.idTeam = idTeam;
        this.picture = picture;
        this.name = name;
        this.surname = surname;
        this.description = description;
    }

    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
        this.idTeam = idTeam;
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
