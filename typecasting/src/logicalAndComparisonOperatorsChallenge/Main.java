/*

import java.util.Scanner;
            Objective is to take user input
            input 1 : weight
            input 2: height
            Calculate weight and weight to a ratio e.g 170cm 100kg
            BMI calculation
            BMI = (mass)/(height*height)
            mass = kg
            height = meter

            Compare the ratio using either if/else or switch cases.

            Print each case dependinng on caluclation

         */
package logicalAndComparisonOperatorsChallenge;

import logicalAndComparisonOperatorsChallenge.utils.PrinterHelper;
import logicalAndComparisonOperatorsChallenge.weightGuru.Weightguru;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter weight
        System.out.println("*----Enter Your Weight in KG----*");
        float weight = scanner.nextFloat();

        // Prompt user to enter height
        System.out.println("*----Enter Your Height Meter----*");
        float height = scanner.nextFloat();

        // Create a Weightguru object
        Weightguru person = new Weightguru(weight, height);

        // Calculate BMI
        String bmiCategory = person.calculateBmi();

        // Display BMI category
        PrinterHelper.showUserBMI(bmiCategory);
    }
}
