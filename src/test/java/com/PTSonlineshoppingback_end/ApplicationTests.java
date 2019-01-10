package com.PTSonlineshoppingback_end;

import net.PTSonlineshoppingback_end.model.Category;
import net.PTSonlineshoppingback_end.services.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {Category.class,CategoryService.class})
@EnableJpaRepositories("net.PTSonlineshoppingback_end.repository")
@EntityScan("net.PTSonlineshoppingback_end.model")
@EnableAutoConfiguration
public class ApplicationTests {

    @Autowired
    private CategoryService categoryService;
    
	@Test
	public void testAddCategory() {
           Category category =  new Category("Laptop", "Macbook Pro","Apple");
           this.categoryService.addCategory(category);
	}

}
