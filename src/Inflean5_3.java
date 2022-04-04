import java.util.LinkedList;
import java.util.Scanner;
/*
크레인 인형뽑기(카카오)
*/

public class Inflean5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int goal = sc.nextInt() - 1;
            for (int j = 0; j < num; j++) {
                if (arr[j][goal] != 0) {
                    if (stack.peek() != null && stack.peek() == arr[j][goal]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(arr[j][goal]);
                    }
                    arr[j][goal]=0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
