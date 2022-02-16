import java.util.Scanner;

public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int num = 0;
        int equal = 0;
        int max = Integer.parseInt(strs[0]);
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].equals(strs[j])) {
                    equal = Integer.parseInt(strs[j]);
                    num++;
                }
                if (Integer.parseInt(strs[j]) >= max)
                    max = Integer.parseInt(strs[j]);
            }
        }
        if (num == 0)
            System.out.println(max * 100);
        else if (num == 1)
            System.out.println(1000 + equal * 100);
        else
            System.out.println(10000 + equal * 1000);
    }
}

