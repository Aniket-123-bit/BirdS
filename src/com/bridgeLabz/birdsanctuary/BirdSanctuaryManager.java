package com.bridgeLabz.birdsanctuary;

import java.util.HashSet;
import java.util.Set;


public class BirdSanctuaryManager {
    Set<Birds> birdList = new HashSet<Birds>();


    public void add(Birds bird) throws BirdSanctuaryException {
        if (bird == null) {
            throw new BirdSanctuaryException();
        } else if(birdList.add(bird)) {
            bird.incrementCount();
            bird.totalCount++;

        }
    }

    public void remove(Birds bird) {
        if(birdList.remove(bird)) {
            bird.decrementConut();
        }
    }

    public void print() {
        for (Birds list: birdList) {
            System.out.println(list);
        }
    }

    public void printFlyable() {
        for(Birds birds:birdList) {
            if (birds instanceof Flyable) {
                ((Flyable)birds).fly();
            }
        }
    }

    public void printSwimmable() {
        for (Birds birds:birdList) {
            if (birds instanceof Swimmable) {
                //        ((Swimmable)birds).swim();
                Swimmable s = (Swimmable)birds;
                s.swim();
            }
        }
    }

    public void printEatable() {
        for (Birds birds:birdList) {
            birds.eat();
        }
    }
}
