package com.bridgeLabz.birdsanctuary;

public class  Parrot extends Birds implements Flyable{
    static int count;

    public Parrot(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Parrot [id=" + id + "]";
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println(id + " is eating  ");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println( id + " is flying");
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void decrementConut() {
        count--;
    }



}