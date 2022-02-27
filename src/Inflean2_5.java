import java.util.Scanner;

public class Inflean2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer= 0;

        label:
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                 if (i % j == 0)
                    continue label;
            }
            answer++;
        }
        System.out.print(answer);
    }
}