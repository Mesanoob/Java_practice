package operators;

public class Main {
    public static void main(String[] args) {
        Operators ops = new Operators();

        int addResult = ops.add(10, 10);
        int subtractResult = ops.subtract(10, 10);
        int multipleResult = ops.multiply(10, 10);
        float divideResult = ops.divide(10, 10);
        float modulusResult = ops.modulus(10, 10);
        int negateResult = ops.negate(10);
        int positiveNumber = ops.positiveNum(-10);
        int incrementResult = ops.increment(30);
        int decrementResult = ops.decrement( 10);
        boolean notResult = ops.not(true);

//        Operator.Operators.displayResults(addResult);
//        Operator.Operators.displayResults(subtractResult);
//        Operator.Operators.displayResults(multipleResult);
//        Operator.Operators.displayFloatResults(divideResult);
//        Operator.Operators.displayFloatResults(modulusResult);
//        Operator.Operators.displayResults(negateResult);
//        Operator.Operators.displayResults(positiveNumber);
        Operators.displayResults(incrementResult);
        Operators.displayResults(decrementResult);
        Operators.displayBooleanResults(notResult);
    }
}