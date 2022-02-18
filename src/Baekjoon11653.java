import java.util.Scanner;

public class Baekjoon11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = sc.nextInt();
        while (goal != 1) {
            for (int i = 2; i <= goal; i++) {
                while (goal % i == 0) {
                    System.out.println(i);
                    goal /= i;
                }
            }
        }
    }
}

