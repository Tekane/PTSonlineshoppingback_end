package net.PTSonlineshoppingback_end.services;
import java.util.ArrayList;
import java.util.List;
import net.PTSonlineshoppingback_end.model.Category;
import net.PTSonlineshoppingback_end.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
/**
 *
 * @author tekane
 */
@Service
@Qualifier("categoryService")
public class CategoryService {
   /* private final CategoryRepository categoryRepository;
    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }*/
     private static  List<Category> categories = new ArrayList<>();
        static {
            
         Category category = new Category();
         category.setId(1);
         category.setName("Tv");
         category.setDescription("This is a QLED tv");
       
        categories.add(category);
        
        //Second category
        Category category2 = new Category();
        category.setId(2);
        category.setName("Mobile");
        category.setDescription("TK e bogale this phone");
        
        categories.add(category2);
        
        }
        
        public  List<Category> displayCategories(){
            return categories;
        }
}
