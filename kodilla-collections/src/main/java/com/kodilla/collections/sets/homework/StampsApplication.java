package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps=new HashSet<>();
        stamps.add(new Stamp("Krakowianka", "1x2cm", true));
        stamps.add(new Stamp("Marcinek", "2x2cm", false));
        stamps.add(new Stamp("Big Johny", "5x7cm", true));
        stamps.add(new Stamp("Small Henry", "1x1cm", false));
        stamps.add(new Stamp("Krakowianka", "1x2cm", false));
        stamps.add(new Stamp("Small Henry", "1x1cm", false)); // 6 znaczkow dodanych powinno wyswietlic 5

        System.out.println(stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp);
    }
}