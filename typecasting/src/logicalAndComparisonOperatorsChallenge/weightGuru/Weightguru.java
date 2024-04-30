package logicalAndComparisonOperatorsChallenge.weightGuru;

public class Weightguru {
    public float weight;
    public float height;
    public float bmi;

    public Weightguru(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public String calculateBmi() {
        bmi = weight / (height * height);

        String feedback;
        if (bmi < 18.5) {
            feedback = bmi + " You are Underweight";
        } else if (bmi < 25) {
            feedback = bmi + " You are Normal weight";
        } else if (bmi < 30) {
            feedback = bmi + " You are Overweight";
        } else {
            feedback = bmi + " You are FAT!";
        }
        return feedback;
    }
}
