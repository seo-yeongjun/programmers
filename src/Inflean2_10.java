import java.util.Scanner;

public class Inflean2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        int[][] arr = new int[num + 2][num + 2];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1])
                    answer++;
            }
        }
        System.out.println(answer);
    }
}