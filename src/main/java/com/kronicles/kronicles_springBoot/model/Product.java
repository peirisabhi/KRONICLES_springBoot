package com.kronicles.kronicles_springBoot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    int id;
    String product_name;
    String product_desc;
    String buying_price;
    String selling_price;
    String qty;
    String catergory_id;

    public Product() {
    }

    public Product(int id, String product_name, String product_desc, String buying_price, String selling_price, String qty, String catergory_id) {
        this.id = id;
        this.product_name = product_name;
        this.product_desc = product_desc;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.qty = qty;
        this.catergory_id = catergory_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public String getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(String buying_price) {
        this.buying_price = buying_price;
    }

    public String getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(String selling_price) {
        this.selling_price = selling_price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getCatergory_id() {
        return catergory_id;
    }

    public void setCatergory_id(String catergory_id) {
        this.catergory_id = catergory_id;
    }
}
