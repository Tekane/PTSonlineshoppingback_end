/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.PTSonlineshoppingback_end.services;
import java.util.List;
import net.PTSonlineshoppingback_end.model.Product;
import net.PTSonlineshoppingback_end.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author tekane
 */
@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product getProductById(int productId){
        return  this.productRepository.getOne(productId);
    } 
    public List<Product> getAllProducts(){
        List<Product> productsList =  this.productRepository.findAll();
        return productsList != null && productsList.size() > 0 ? productsList : null;
    }
    public void createProduct(Product product){
        this.productRepository.save(product);
    }
    public void updateProduct(Product product){
        
    }
    public void deleteProduct(Product product){
        product.setActive(false);
        this.productRepository.save(product);
    }
    public  List<Product> getAllActiveProducts(){
        List<Product> products = this.productRepository.findAllActiveProducts();
        return products !=null && products.size() > 0 ? products : null;
    }
    public  List<Product> getAllActiveProductsByCategorId(int category){
        List<Product> productsList = this.productRepository.findActiveProductsByCategoryId(category);
        return productsList !=null && productsList.size() > 0 ? productsList : null;
    }
    public List<Product> getLatestActiveProducts(int products){
         List<Product> productsList = this.productRepository.findLatestActiveProducts(products);
        return productsList !=null && productsList.size() > 0 ? productsList : null;
    }
}
