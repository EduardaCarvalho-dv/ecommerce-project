package com.lp1.project.app.screens;

import com.lp1.project.app.forms.AddCategoryForm;
import com.lp1.project.domain.category.Category;

public class AddCategoryScreen {
    public static void show() {
        try {
            String name = AddCategoryForm.name();
            String description = AddCategoryForm.description();
//            Category parentCategory = AddCategoryForm.parentCategory();

            Category category = new Category(name, description, null);

            System.out.println("Categoria criada com sucesso");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
