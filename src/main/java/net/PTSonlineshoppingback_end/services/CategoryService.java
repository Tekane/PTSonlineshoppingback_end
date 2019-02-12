package net.PTSonlineshoppingback_end.services;
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
    
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public  List<Category> displayCategories(){

        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id){
            for (Category category : categoryRepository.findAll()) {
                if (category.getId() == id) {
                   return  categoryRepository.getOne(id);
                }
            }
             return  null;
      }
    public void addCategory(Category category){
        this.categoryRepository.save(category);
    }      
}
