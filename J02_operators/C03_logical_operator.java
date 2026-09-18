public class C03_logical_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a > 5 && b < 30: " + (a > 5 && b < 30));
        System.out.println("a > 5 || b < 30: " + (a > 5 || b < 30));
        System.out.println("!(a > 5): " + !(a > 5));

    }
}