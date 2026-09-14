import java.util.*;

public class C01_arithmetic_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        //Unary operator
        int c = 5;
        int d = a++;
        System.out.println( c);
        System.out.println(d);
    }
}
