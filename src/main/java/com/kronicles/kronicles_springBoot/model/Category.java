package com.kronicles.kronicles_springBoot.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Category {
    private int id;
    private String category;
    private String categoryDesc;
    private Collection<Product> productsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "category_desc")
    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category1 = (Category) o;

        if (id != category1.id) return false;
        if (category != null ? !category.equals(category1.category) : category1.category != null) return false;
        if (categoryDesc != null ? !categoryDesc.equals(category1.categoryDesc) : category1.categoryDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (categoryDesc != null ? categoryDesc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoryByCategoryId")
    public Collection<Product> getProductsById() {
        return productsById;
    }

    public void setProductsById(Collection<Product> productsById) {
        this.productsById = productsById;
    }
}
