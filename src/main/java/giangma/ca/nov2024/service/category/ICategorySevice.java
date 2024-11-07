package giangma.ca.nov2024.service.category;

import giangma.ca.nov2024.model.Category;

import java.util.List;

public interface ICategorySevice {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();

    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);

}
