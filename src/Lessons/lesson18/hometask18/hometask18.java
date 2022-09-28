package Lessons.lesson18.hometask18;

import java.util.Scanner;

public class hometask18 {
    public static void main(String[] args) {
        int burgerPrice = 50;
        String a = "Do you want to add second ingredient?";
        String b = "No";

        System.out.println("Choose additional Ingredients to your burger");
        System.out.println("" + Ingredients.SOUCE.index + " - " + Ingredients.SOUCE.name);
        System.out.println("" + Ingredients.KOTLET.index + " - " + Ingredients.KOTLET.name);
        System.out.println("" + Ingredients.CHEESE.index + " - " + Ingredients.CHEESE.name);

        Scanner scan = new Scanner(System.in);
        String addIngr = scan.nextLine();


        for (Ingredients c : Ingredients.values()) {
            if (c.name.equals(addIngr) || c.index.equals(addIngr)) {
                System.out.println("" + c.name + " added");
                burgerPrice += c.price;
            }
        }
        System.out.println(a);
        String secondIngredient = scan.nextLine();
        if (secondIngredient != b) {
            for (Ingredients c : Ingredients.values()) {
                if (c.name.equals(secondIngredient) || c.index.equals(secondIngredient)) {
                    System.out.println("" + c.name + " added");
                    burgerPrice += c.price;

                }
            }
        }
        System.out.println("Price of your burger: " + burgerPrice);
    }
}
