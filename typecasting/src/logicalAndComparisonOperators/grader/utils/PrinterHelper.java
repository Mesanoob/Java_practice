package logicalAndComparisonOperators.grader.utils;

public class PrinterHelper {

    public static void showMainMenu(){
        System.out.println("*----Check Your Grade---*");
        System.out.println("*Select an option       *");
        System.out.println("* a. Enter a grade       *");
        System.out.println("* b. Exit program        *");
        System.out.println("*-----------------------*");
    }

    public static void showGradeMenu(){
        System.out.println("*----Enter a Grade between 1 to 10----*");
        System.out.println("*-------------------------------------*");
    }

    public static void showGradeFeedback(String feedback){
        System.out.println("*--- Grade Result(s) ---*");
        System.out.println(feedback);
    }

}
