import java.util.Arrays;
import java.util.Scanner;

public class Inflean2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        int[] answer = new int[num];
        int d = 1;
        for (int i = 0; i < num; i++) {
            arr[i][0] = i;
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (o1, o2) -> o2[1] - o1[1]);

        for (int i = 0; i < num; i++) {
            if (i - 1 >= 0 && arr[i][1] == arr[i - 1][1]) {
                answer[arr[i][0]] = answer[arr[i - 1][0]];
            } else {
                answer[arr[i][0]] = d;
            }
            d++;
        }
        String answerStr = Arrays.toString(answer).replace(",", "");
        answerStr = answerStr.substring(1, answerStr.length() - 1);
        System.out.println(answerStr);
    }
}