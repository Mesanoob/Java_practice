package logicalAndComparisonOperatorsChallenge.utils;

public class PrinterHelper {

    public static void showUserEntry() {
        System.out.println("*----Enter Your Weight in KG----*");
        System.out.println("*----Enter Your Height Meter----*");
    }

    public static void showUserBMI(String feedback) {
        System.out.println("*----Your BMI IS----*");
        System.out.println(feedback);
    }
}
