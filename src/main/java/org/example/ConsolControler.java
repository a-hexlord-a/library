package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsolControler {

    public void run() {
        String welkom = """
                welcom
                tu the
                club badi""";
        System.out.println(welkom);
        System.out.println("menu");
        String[] MenuItems = {
                "User",
                "book"
        };
        String[]userItem = {"user","User "};
        String[]bookItem = {"book" , "book "};
        ArrayList<String[]> menuItemsColection = new ArrayList<>();
        menuItemsColection.add(userItem);
        menuItemsColection.add(bookItem);
        for (String item : MenuItems) {
            System.out.println(String.format(
                    "%s : " ));
        }
        System.out.print("enter thr comand: ");
        String input = Scanner.nextLine();
        System.out.print("enter command" + input);


        private boolean chekmenuItems (ArrayList<String[]> menuItems) {
for (String item : MenuItems);

        }
    }


}
