/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PTSonlineshoppingback_end;

import java.util.List;
import net.PTSonlineshoppingback_end.model.Category;
import net.PTSonlineshoppingback_end.model.Product;
import net.PTSonlineshoppingback_end.services.CategoryService;
import net.PTSonlineshoppingback_end.services.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author tekane
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Category.class,CategoryService.class,
    ProductService.class})
@EnableJpaRepositories("net.PTSonlineshoppingback_end.repository")
@EntityScan("net.PTSonlineshoppingback_end.model")
@EnableAutoConfiguration
public class ProductTestCase {
    @Autowired
    private final ProductService productService = null;

    @Test
    public void testProduct(){
        Product product = new Product();
        product.setName("Mobile");
        product.setBrand("Apple");
        product.setDescription("Apple laptop , 15 with 8gm ram" );
        product.setUnitPrice(1800);
        product.setActive(true);
        product.setCategoryId(3);
        product.setSuppliedId(3);
        product.setQuantity(2);
        
        this.productService.createProduct(product);
        
        Product product2 = new Product();
        product2.setName("Mobile");
        product2.setBrand("Samsung Note 8");
        product2.setDescription("1TB , 16Gb ram 16");
        product2.setUnitPrice(14500);
        product2.setActive(true);
        product2.setCategoryId(3);
        product2.setSuppliedId(3);
        product2.setQuantity(2);
        this.productService.createProduct(product2);

        Product product3 = new Product();
        product3.setName("Mobile");
        product3.setBrand("Huawei");
        product3.setDescription("1TB , 16Gb ram 16");
        product3.setUnitPrice(7000);
        product3.setActive(true);
        product3.setCategoryId(3);
        product3.setSuppliedId(3);
        product3.setQuantity(2);
        this.productService.createProduct(product3);
       
    }
   //  @Test
    public void getActiveProducts(){
        // List<Product> products =  this.productService.getAllActiveProducts();
         //System.out.println(products.size());
         
         List<Product> products  = this.productService.getActiveProductsByCategoryId(3);
         System.out.println(products.size());
    }
    //@Test
    public void getLatestActiveProduct(){
         List<Product> products  =  this.productService.getLatestActiveProducts(3);
         System.out.println(products.size());
    }
}
