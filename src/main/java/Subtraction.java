import java.util.ArrayList;
import java.util.List;

public class Subtraction {
    public static void main(String[] args) {
        System.out.println("This is subtracting");
        int a = 10;
        int b = 20;
        int sum = a - b;
        System.out.println("The ans is " + sum);


    }

    int sub(int a, int b) {
        return a - b;
    }

    float sub(float a, float b) {
        return a - b;
    }

    Integer subInt(Integer a, Integer b) {
        return a - b;
    }

    public static void throwsRuntime(int a, int b) {

        //try {
            int c =a/b;
        /*} catch (ArithmeticException e) {
            System.out.print("");
            throw e;
        }*/

    }
}