package com.epam.jb2.inheritance.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Appliance {
    public String name;
    public double price;
    public Date expirationDate;

    public Appliance(String name, double price, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String info() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return "name: " + this.name + " price: " + this.price + ", workUntil: " + dateFormat.format(this.expirationDate) + "/n";
    }
}
