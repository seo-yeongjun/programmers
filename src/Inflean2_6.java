import java.util.Scanner;

public class Inflean2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        for (int test = 0; test < num; test++) {
            int a = Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(sc.nextInt())).reverse()));
            if (a == 1)
                continue;
            int pos = 0;
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    pos = 1;
                    break;
                }
            }
            if (pos == 0)
                answer.append(a).append(' ');

        }
        System.out.println(answer.deleteCharAt(answer.length()-1));
    }
}