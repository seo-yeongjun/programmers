import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Baekjoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (; a <= b; a++) {
            int an = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && i != 1 && i != a||a==1) {
                    an = -1;
                    break;
                }
            }
            if (an == 0)
                arr.add(a);
        }
        Iterator<Integer> it = arr.iterator();
        int answer = 0;
        while (it.hasNext()) {
            answer += it.next();
        }
        if (arr.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
            System.out.println(arr.get(0));
        }

    }
}



