package J04_Loops;

public class C04_sumOf_natural_num {
    int n sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    int i = 1;
    while (i <= n) {
        sum += i;
        i++;
    }
}
