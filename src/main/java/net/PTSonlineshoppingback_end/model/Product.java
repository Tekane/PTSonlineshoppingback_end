/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.PTSonlineshoppingback_end.model;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
/**
 *
 * @author tekane
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    @NotBlank(message = "Please enter the Product Name!")
    private String name;
    @NotBlank(message = "Please enter Brand Name!")
    private String brand;
    @NotBlank(message = "Please enter Product description!")
    private String description;
    @Column(name = "unit_price")
    @Min(value = 1 , message = "The price cannot be less than 1!")
    private double unitPrice;
    private int quantity;
    @Column(name = "is_active")
    private boolean active;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "supplier_id")  
    private int suppliedId;
    private int purchases;
    private int views;
    @Transient
    private MultipartFile multipartFile;
    
    public Product() {
        this.code ="PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
    }
    
    public Product(String code, String name, String brand, String description, double unitPrice, int quantity, boolean active, int categoryId, int suppliedId, int purchases, int views) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.active = active;
        this.categoryId = categoryId;
        this.suppliedId = suppliedId;
        this.purchases = purchases;
        this.views = views;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSuppliedId() {
        return suppliedId;
    }

    public void setSuppliedId(int suppliedId) {
        this.suppliedId = suppliedId;
    }

    public int getPurchases() {
        return purchases;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", active=" + active +
                ", categoryId=" + categoryId +
                ", suppliedId=" + suppliedId +
                ", purchases=" + purchases +
                ", views=" + views +
                '}';
    }
}
