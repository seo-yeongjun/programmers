import java.util.Locale;
import java.util.Scanner;

public class Inflean1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        String answer = "YES";
        while (start < end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else {
                answer = "NO";
                break;
            }
        }
        System.out.print(answer);
    }
}
