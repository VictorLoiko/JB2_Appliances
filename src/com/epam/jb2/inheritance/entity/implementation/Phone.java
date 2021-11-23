package com.epam.jb2.inheritance.entity.implementation;

import com.epam.jb2.inheritance.entity.Appliance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Phone extends Appliance {
    private double volume;

    public Phone(String name, double price, Date expirationDate, double volume) {
        super(name, price, expirationDate);
        this.volume = volume;
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
        return "Phone name: " + this.name + ", price: "+this.price+", workUntil: "+dateFormat.format(this.expirationDate)+", volume: "+this.volume;
    }
}
