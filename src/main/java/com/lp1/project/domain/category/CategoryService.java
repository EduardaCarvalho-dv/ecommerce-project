package com.lp1.project.domain.category;

import com.lp1.project.domain.repository.CategoryRepository;
import com.lp1.project.domain.user.Admin;
import com.lp1.project.domain.user.User;

public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void createCategory(User user, Category product) {
        if (!(user  instanceof Admin)) {
            throw new RuntimeException("Apenas administradores podem cadastrar categorias.");
        }

        if (repository.findByName(product.getName()) != null) {
            throw new RuntimeException("Categoria já existe.");
        }

        repository.save(product);
    }
}
