package logicalAndComparisonOperators;

import logicalAndComparisonOperators.grader.Grader;
import logicalAndComparisonOperators.grader.utils.PrinterHelper;
import java.util.Scanner;

public class Main {
    /*
            Objective is to track the following inputs:
            1. "Failed" if they scored 3 or less
            2. "Insufficient" if they scored > 3 but less than 5. (5 included)
            3. "Good" if they scored > 5 but less than 8. (8 included)
            4. "Excellent" Grade if they scored 10.
            5. If participants enter a negative number or a number outside the range supported (outside 0 - 10)
     * */

    // Initialise option to start with a int of 0
    public static void main(String[] arg){
        char option = 0;
        int grade = 0;
        // create instanceof a scanner object
        // Use 'System.in" connects to the keyboard to capture users input when the program executes
        Scanner scanner = new Scanner(System.in);

        do {
            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);

            if (option != 'a') {
                // If option 1 is selected, handle it here
                continue;
            } else if (option == 'b') {
                // If option 2 is selected, exit the loop
                break;
            }

            PrinterHelper.showGradeMenu();
            grade = scanner.nextInt();

            Grader grader = new Grader(grade);
            PrinterHelper.showGradeFeedback(grader.showGrade());
        } while(option != 'b'); // Corrected the condition here

    }
}
