package logicalAndComparisonOperators.grader;

public class Grader {
    public int grade;

    public Grader(int grade) {
        this.grade = grade;
    }

    public String showGrade(){
        //Create a variable to store the feedback
        String feedback = "";
        if(this.grade >= 0 && this.grade <=3)
            feedback = "Failed";
        else if(this.grade >3 && this.grade <=5)
            feedback = "Insufficient";
        else if(this.grade >5 && this.grade <=8)
            feedback = "good";
        else if (this.grade == 9 || this.grade == 10)
            feedback = "excellent";
        else
            feedback = "Invalid entry";

        return feedback;
    }
}
