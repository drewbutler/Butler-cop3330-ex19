/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);

        System.out.println("Input you wieght in pounds");
        int weight = myObj.nextInt();

        System.out.println("Input you height in inches");
        int height = myObj2.nextInt();
        
        float height2 = height * height;
        float bmi2 = weight / height2;

        float bmi = bmi2 * 703;

        System.out.println("Your BMI is " + bmi);

        if (bmi > 18.5 && bmi < 25){
            System.out.println("You are within the ideal weight range");
        } else if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor");
        } else {
            System.out.println("You are underweight. You should see your doctor");
        }
        
        myObj.close();
    }
}