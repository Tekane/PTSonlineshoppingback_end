package net.PTSonlineshoppingback_end.repository;

import net.PTSonlineshoppingback_end.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author tekane
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
