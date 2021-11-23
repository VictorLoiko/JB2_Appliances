package com.epam.jb2.inheritance;

import com.epam.jb2.inheritance.entity.Appliance;
import com.epam.jb2.inheritance.entity.implementation.Iron;
import com.epam.jb2.inheritance.entity.implementation.Kettle;
import com.epam.jb2.inheritance.entity.implementation.Phone;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliancesList = new ArrayList<>();
        Appliance toFind = null;
        for (int i = 0; i < 3; i++) {
            appliancesList.add(new Kettle(createRandomString(),Math.random()*1000,new Date(),Math.random()*1000));
        }

        for (int i = 0; i < 3; i++) {
            appliancesList.add(new Iron(createRandomString(),Math.random()*1000,new Date(),Math.random()*1000));
        }

        for (int i = 0; i < 4; i++) {
            Appliance phone = new Phone(createRandomString(),Math.random()*1000,new Date(),Math.random()*10);
            appliancesList.add(phone);
            toFind = phone;
        }

        int a = (int) (Math.random()*1000);
        int b = (int) (Math.random()*1000);

        appliancesList.forEach(appliance -> {
            System.out.println(appliance.info());
        });

        System.out.println("Is list contains "+toFind.getClass()+" "+toFind.getName()+"? :"+appliancesList.contains(toFind));

        System.out.println("Elements with price between "+a+" and "+b );
        System.out.println(appliancesList.stream()
                .filter(element -> element.price>Math.min(a,b)&&element.price<Math.max(a,b))
                .map(Appliance::getName)
                .collect(Collectors.toList()));

    }

    private  static String createRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
