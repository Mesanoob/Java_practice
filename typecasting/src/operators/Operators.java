package operators;

public class Operators {

    // create an add method for Operator.Operators
    public int add(int a, int b) {
        return a + b;
    }

    //create a subtract method for operator class
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

    public float modulus(float a, float b) {
        return a % b;
    }

    //create a method to negate an integer passed in

    public int negate(int a){
        return -a;
    }

    public int positiveNum(int a){
        return Math.abs(a);
    }

    public int increment(int a){
     return ++a;
    }

    public int decrement(int a){
        return --a; // pre decrement
        // return a-; // post decrement
    }

    public boolean not(boolean a){
        return !a;
    }


    //static method to display arithmetic operations results
    public static void displayResults(int data) {
        System.out.println(data);
    }
    public static void displayFloatResults(float data) {
        System.out.println(data);
    }

    public static void displayBooleanResults(boolean data){
        System.out.println(data);
    }
}

