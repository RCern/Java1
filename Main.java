package com.company;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.setBread(new PlainBread());
        //burger.addIngredient(new Ham());
        burger.addIngredient(new Cheese());
        burger.addIngredient(new Lettuce());
       // burger.addIngredient(new Steak());
        burger.totalPrice();
        System.out.println("Price: " +burger.get_total_price());
        burger.generate_descritpion();
        System.out.println(burger.get_description());
        System.out.println(burger.check_for_veggie());
    }
}
