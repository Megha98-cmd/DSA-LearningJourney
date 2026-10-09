public class C07_ternaryOperator {
    public static void main(String[] args) {
        int number = 10;

        //ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}