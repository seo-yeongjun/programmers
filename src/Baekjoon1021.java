import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int 크기 = sc.nextInt();
        int 갯수 = sc.nextInt();
        int[] nums = new int[갯수];
        int answer = 0;
        for (int i = 0; i < 갯수; i++) {
            nums[i] = sc.nextInt();
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 크기; i++) {
            list.add(i);
        }
        for (int num : nums) {
            if (list.indexOf(num) <= list.size() / 2) {
                int nu = list.indexOf(num);
                for (int i = 0; i < nu; i++) {
                    list.add(list.pop());
                    answer++;
                }
                list.pop();
            } else {
                int nu = list.indexOf(num);
                for (int i = list.size(); i > nu; i--) {
                    list.push(list.removeLast());
                    answer++;
                }
                list.pop();
            }
        }
        System.out.println(answer);
    }
}

