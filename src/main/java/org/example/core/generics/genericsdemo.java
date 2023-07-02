package org.example.core.generics;

public class genericsdemo {

    public static void main(String[] args) {
        Printer<Dog> printer = new Printer<>(new Dog());
        printer.print();
    }
}
class Printer<T>{
    T thingstoprint ;
    Printer(T thingstoprint ){
        this.thingstoprint=thingstoprint;
    }

    void print(){
        System.out.println(thingstoprint);
        System.out.println(thingstoprint.numLegs(4));
        System.out.println(thingstoprint.animalName("This the Dog"));
    }

//    <T,V> int<x&y> addTwoNum(T x,V y){
//        return x+y;
//    }
}
