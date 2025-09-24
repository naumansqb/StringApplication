package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        System.out.println("Step 1: ");
        String favColor= "Red";
        int yearStarted=2025;
        char middleInitial = 'A';
        boolean hasPets=true;
        String message = "Projects get you to the door, but Leetcode gets you through the door";
        System.out.println("Favorite Color: " + favColor);
        System.out.println("Year I started LTCA: " + yearStarted);
        System.out.println("My middle initial is " + "'" +middleInitial+"'");
        System.out.println("It is "+hasPets+" that I have a pet.");
        System.out.println("A good saying that I agree with is: "+'"'+message+'"');

        // Step 2
        System.out.println("Step 2:");
        int numOfDay=7;
        double coffeePrice=4.99;
        char favLetter='N';
        boolean isRaining= false;

        System.out.println("There are "+numOfDay+" days in a week");
        System.out.println("The price of coffee is $"+ coffeePrice);
        System.out.println("My favorite letter is: "+favLetter);
        System.out.println("It is "+isRaining+" that it's raining outside");
    }
}
