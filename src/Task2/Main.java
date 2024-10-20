package Task2;

import Task1.Customer;

public class Main {
    public static void main (String [] args){
        Cafe kaffe = new Cafe();
        kaffe.loadMenuData();

            for ( String s : kaffe.getCoffeeMenu() ){
            System.out.println(s);
        }
    }
}