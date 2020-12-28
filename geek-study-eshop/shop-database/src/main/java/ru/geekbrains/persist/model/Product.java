package ru.geekbrains.persist.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Size(min=3, max=20, message="Title must have 3-20 characters")
    @Column(name = "title")
    private String title;

    @NotEmpty
    @Size(min=3, max=20, message="Title must have 3-20 characters")
    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categtory category;

    public Product() {
    }

    public Product(String title, String brandName, Double price, String image, Categtory category) {
        this.title = title;
        this.brandName = brandName;
        this.price = price;
        this.image = image;
        this.category = category;
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

    public Categtory getCategory() {
        return category;
    }

    public void setCategory(Categtory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", brandName=" + brandName +
                ", image=" + image +
                '}';
    }
}
