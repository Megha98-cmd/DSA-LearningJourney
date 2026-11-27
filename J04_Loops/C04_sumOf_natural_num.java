package J04_Loops;
import java.util.Scanner;

public class C04_sumOf_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

    int i=0;
    while (i <= n) {
        sum += i;
        i++;
    }
    System.out.println(sum);
  }
}
