import java.util.Scanner;

public class Inflean2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            int b = sc.nextInt();
            int abs = Math.abs(a[i] - b);
            if (abs == 1)
                sb.append(a[i] > b ? 'A' : 'B').append('\n');
            else if (abs == 2)
                sb.append(a[i] < b ? 'A' : 'B').append('\n');
            else if (abs == 0)
                sb.append('D').append('\n');
        }
        System.out.print(sb);
    }
}