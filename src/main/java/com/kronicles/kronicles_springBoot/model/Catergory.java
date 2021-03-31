package com.kronicles.kronicles_springBoot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catergory {
    @Id
    int id;
    String catergory;
    String catergory_desc;

    public Catergory(int id, String catergory, String catergory_desc) {
        this.id = id;
        this.catergory = catergory;
        this.catergory_desc = catergory_desc;
    }

    public Catergory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatergory() {
        return catergory;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }

    public String getCatergory_desc() {
        return catergory_desc;
    }

    public void setCatergory_desc(String catergory_desc) {
        this.catergory_desc = catergory_desc;
    }
}
