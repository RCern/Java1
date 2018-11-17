package com.company;

public class Ingredient {
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    private String _name;
    private double _price;

    public boolean is_veggie() {
        return _veggie;
    }

    public void set_veggie(boolean _veggie) {
        this._veggie = _veggie;
    }

    private boolean _veggie;

}
