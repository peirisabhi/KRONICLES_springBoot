package com.kronicles.kronicles_springBoot.model;

import javax.persistence.*;

@Entity
public class Product {
    private int id;
    private String productName;
    private String productDesc;
    private Double buyingPrice;
    private Double sellingPrice;
    private Integer qty;
    private Integer categoryId;
    private Category categoryByCategoryId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_desc")
    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Basic
    @Column(name = "buying_price")
    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    @Basic
    @Column(name = "selling_price")
    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Basic
    @Column(name = "qty")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productDesc != null ? !productDesc.equals(product.productDesc) : product.productDesc != null) return false;
        if (buyingPrice != null ? !buyingPrice.equals(product.buyingPrice) : product.buyingPrice != null) return false;
        if (sellingPrice != null ? !sellingPrice.equals(product.sellingPrice) : product.sellingPrice != null)
            return false;
        if (qty != null ? !qty.equals(product.qty) : product.qty != null) return false;
        if (categoryId != null ? !categoryId.equals(product.categoryId) : product.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productDesc != null ? productDesc.hashCode() : 0);
        result = 31 * result + (buyingPrice != null ? buyingPrice.hashCode() : 0);
        result = 31 * result + (sellingPrice != null ? sellingPrice.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }
}
