/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.PTSonlineshoppingback_end.repository;
import java.util.List;
import net.PTSonlineshoppingback_end.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author tekane
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{ 
    @Query("FROM Product as pd WHERE pd.active = 1")
    List<Product> findAllActiveProducts();
    @Query("FROM Product WHERE active = :active and categoryId = :categoryId")
    List<Product> findActiveProductsByCategoryId(int categoryId);
    @Query("From Product where active = :active order by id")
    List<Product> findLatestActiveProducts(int count);
}
