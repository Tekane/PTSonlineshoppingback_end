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
        product.setName("PS4");
        product.setBrand("Sony");
        product.setDescription("PS4 for players , comes in 4K");
        product.setUnitPrice(8000);
        product.setActive(true);
        product.setCategoryId(3);
        product.setSuppliedId(3);
        
        //this.productService.createProduct(product);
        
        Product product2 = new Product();
        product2.setName("PS4");
        product2.setBrand("Sony");
        product2.setDescription("PS4 for players , comes in 4K");
        product2.setUnitPrice(8000);
        product2.setActive(true);
        product2.setCategoryId(3);
        product2.setSuppliedId(3);
        
       // this.productService.deleteProduct(product);
       
        List<Product> products =  this.productService.getAllActiveProducts();
        System.out.println(products.size());
    }
}
