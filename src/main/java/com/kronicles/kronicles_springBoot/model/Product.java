package com.kronicles.kronicles_springBoot.model;

import javax.persistence.*;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String product_name;
    String product_desc;
    String buying_price;
    String selling_price;
    String qty;

//    @ManyToOne(cascade = CascadeType.MERGE ,fetch = FetchType.EAGER)
//    @JoinColumn(name = "id")
@ManyToOne
@JoinColumn(name="catergory_id")
    Catergory catergory;

    public Product() {
    }

    public Product(int id, String product_name, String product_desc, String buying_price, String selling_price, String qty) {
        this.id = id;
        this.product_name = product_name;
        this.product_desc = product_desc;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.qty = qty;
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

}
