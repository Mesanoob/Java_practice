package TypeCasting;

public class NarrowTypeCasting {

    public static void main(String[] args){
        double d = 100.94; // declare variable d of type Double with a value

        long l = (long)d; // explicit typecast to long

        int i = (int)l; // explicity typecast to int

        // Print d, l and i
        System.out.println("double value: " + d);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
    }
}
