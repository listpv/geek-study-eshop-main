package ru.geekbrains.controller.data;

import ru.geekbrains.persist.model.Categtory;
import ru.geekbrains.persist.model.Product;

import java.util.List;

public class CategoryData {

    private Long id;
    private String code;
    private String name;
    private List<Product> productList;

    public CategoryData() {
    }

    public CategoryData(Categtory categtory) {
        this.id = categtory.getId();
        this.code = categtory.getCode();
        this.name = categtory.getName();
        this.productList = categtory.getProductList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "CategoryData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }


//    @Override
//    public String toString() {
//        return name;
//    }
}
