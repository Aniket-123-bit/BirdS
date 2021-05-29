package com.bridgeLabz.birdsanctuary;

public class Penguin  extends Birds implements Swimmable{
static int count;

public Penguin(String id ) {
        this.id = id;
        }

@Override
public String toString() {
        return "Penguin [id=" + id + "]";
        }

@Override
public void eat() {
        // TODO Auto-generated method stub
        System.out.println( id + "is eatting");
        }

@Override
public void swim() {
        // TODO Auto-generated method stub
        System.out.println( id +" is Swimming");
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