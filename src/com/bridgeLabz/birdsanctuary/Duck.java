package com.bridgeLabz.birdsanctuary;

public class   Duck extends Birds implements Flyable,Swimmable {
         static int count;
         public Duck(String id ) {
            this.id = id;
     }
     @Override

           public String toString() {
             return "Duck [id=" + id + "]";
         }

    @Override

        public void eat() {
        // TODO Auto-generated method stub
        System.out.println( id + " is eatting");
    }
    @Override

        public void fly() {
        // TODO Auto-generated method stub
        System.out.println( id + " is  flying");
    }
    @Override

         public void swim() {
        // TODO Auto-generated method stub
        System.out.println( id + " is Swimming");
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