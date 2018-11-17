package com.company;

import java.util.LinkedList;
import java.util.List;


public class Burger {
    private String _description = " ";
    private double _total_price;
    private boolean _veggie;

    private List<Ingredient> _ingredients = new LinkedList<Ingredient>();

    public void setBread(Ingredient br){ _ingredients.add(br);}
    public void addIngredient(Ingredient ing){
        _ingredients.add(ing);
    }
    public String get_description() {
        return "Burger with" + _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_total_price() {
        return _total_price;
    }

    public void set_total_price(double _price) {
        this._total_price = _price;
    }

    public boolean is_veggie() {
        return _veggie;
    }

    public void set_veggie(boolean _veggie) {
        this._veggie = _veggie;
    }

    public List<Ingredient> get_ingredients() {
        return _ingredients;
    }


    public void totalPrice(){
        List<Ingredient> ing = get_ingredients();
        for (int i = 0; i < ing.size();++i){
            _total_price += ing.get(i).get_price();

        }
    }
    public void generate_descritpion(){
        List<Ingredient> ing = get_ingredients();
        for (int i = 0; i < ing.size();++i){
            _description += ing.get(i).get_name();
            _description += ", ";
        }
    }
    public boolean check_for_veggie(){
        List<Ingredient> ing = get_ingredients();
        for (int i = 0; i < ing.size();++i){
            if(!ing.get(i).is_veggie())
                return false;
        }

        return true;
    }

}
