package com.lp1.project.app.screens;

import com.lp1.project.app.App;

public class AdminMainScreen {
    public static void show() {
        try {
            System.out.println("1. Adicionar produto\n2. Adicionar categoria\n3. Adicionar transportadora\n4. Editar produto\n5. Editar categoria\n6. Editar transportadora\n7. Sair");

            int op = App.SCANNER.nextInt();
            App.SCANNER.nextLine();

            switch (op) {
                case 1:
                    AddProductScreen.show();
                    break;
                case 2:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
