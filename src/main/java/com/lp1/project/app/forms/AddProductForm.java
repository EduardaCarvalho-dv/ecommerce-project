package com.lp1.project.app.forms;


import com.lp1.project.app.App;
import com.lp1.project.domain.category.Category;
import com.lp1.project.domain.repository.CategoryRepository;

import java.math.BigDecimal;

public class AddProductForm {
    public static String name() {
        System.out.println("Nome do produto: ");
        return App.SCANNER.nextLine();
    }

    public static String description() {
        System.out.println("Descrição do produto: ");
        return App.SCANNER.nextLine();
    }

    public static Integer stockQuantity() {
        System.out.println("Quantidade em estoque: ");
        return App.SCANNER.nextInt();
    }

    public static BigDecimal price() {
        System.out.println("Preço unitário: ");
        return App.SCANNER.nextBigDecimal();
    }

//    public static Category category() {
//        // Fazer todas categorias serem exibidas para o admin escolher
//        return ;
//    }

    public static Float weight() {
        System.out.println("Peso do produto: ");
        return App.SCANNER.nextFloat();
    }

    public static String technicalSpecs() {
        System.out.println("Especificações técnicas");
        return App.SCANNER.nextLine();
    }

    public static Integer warrantyMonths() {
        System.out.println("Meses de garantia: ");
        return App.SCANNER.nextInt();
    }
}
