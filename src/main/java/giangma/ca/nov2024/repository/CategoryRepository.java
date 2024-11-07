package giangma.ca.nov2024.repository;

import giangma.ca.nov2024.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);

    Category getCategoriesByName(String name);

    Category getCategoriesById(Long categoryId);

    Category deleteCategoriesById(Long id);
}
