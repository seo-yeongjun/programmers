import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon17298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int num = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            while (!list.isEmpty() && Integer.parseInt(arr[list.peek()]) < Integer.parseInt(arr[i])) {
                arr[list.pop()] = arr[i];
            }
            list.push(i);
        }
        while (!list.isEmpty()) {
            arr[list.pop()] = String.valueOf(-1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}

