package ru.geekbrains.controller.data;

import ru.geekbrains.persist.model.Categtory;
import ru.geekbrains.persist.model.Product;


public class ProductData {

    private Long id;
    private String title;
    private String brandName;
    private String image;
    private Double price;
    private Categtory categtory;
    public ProductData() {
    }

    public ProductData(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.brandName = product.getBrandName();
        this.image = product.getImage();
        this.price = product.getPrice();
        this.categtory = product.getCategory();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categtory getCategtory() {
        return categtory;
    }

    public void setCategtory(Categtory categtory) {
        this.categtory = categtory;
    }

//    @Override
//    public String toString() {
//        return "ProductData{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", brandName='" + brandName + '\'' +
//                ", price=" + price +
//                '}';
//    }


    @Override
    public String toString() {
        return "ProductData{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", brandName='" + brandName + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", categtory=" + categtory.getName() +
                '}';
    }
}
