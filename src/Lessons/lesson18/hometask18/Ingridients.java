package Lessons.lesson18.hometask18;

enum Ingredients {
    SOUCE("1", 10, "souce"),
    KOTLET("2", 30, "kotlet"),
    CHEESE("3", 20, "cheese");

    int price;
    String index;
    String name;

    Ingredients(String index, int price, String name) {
        this.index = index;
        this.price = price;
        this.name = name;
    }
}
