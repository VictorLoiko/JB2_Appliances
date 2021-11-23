package com.epam.jb2.inheritance.entity.implementation;

import com.epam.jb2.inheritance.entity.Appliance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Kettle extends Appliance {

    private double timeToBoil;

    public Kettle(String name, double price, Date expirationDate, double timeToBoil) {
        super(name, price, expirationDate);
        this.timeToBoil = timeToBoil;
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

    @Override
    public String info() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return "Kettle name: " + this.name + ", price: "+this.price+", workUntil: "+dateFormat.format(this.expirationDate)+", timeToBoil: "+this.timeToBoil;
    }
}
