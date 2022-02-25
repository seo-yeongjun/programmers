import java.util.Scanner;

public class Inflean1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] keys = new String[num];
        for (int i = 0; i < num; i++) {
            keys[i] = str.substring(i * 7, (i + 1) * 7);
        }
        StringBuilder answer = new StringBuilder();
        for (String s : keys) {
            String c = s.replace('#', '1').replace('*', '0');
            answer.append((char) Integer.parseInt(c, 2));
        }
        System.out.println(answer);
    }
}