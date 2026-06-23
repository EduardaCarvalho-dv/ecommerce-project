package com.lp1.project.app.forms;

import com.lp1.project.app.App;
import com.lp1.project.domain.category.Category;

public class AddCategoryForm {
    public static String name() {
        return App.SCANNER.nextLine();
    }

    public static String description() {
        return App.SCANNER.nextLine();
    }

//    public static Category parentCategory() {
//        // mostrar todas categorias
//        System.out.println();
//
//        return;
//    }
}
