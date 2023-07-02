package org.example.core.generics;

public class Cat implements Animal{

    @Override
    public int numLegs(int x) {
        return x;
    }

    @Override
    public String animalName(String str) {
        return str;
    }

}
