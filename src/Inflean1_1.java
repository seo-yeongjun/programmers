import java.util.Locale;
import java.util.Scanner;

public class Inflean1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char t = sc.nextLine().toLowerCase(Locale.ROOT).charAt(0);
        int answer = 0;
        str = str.toLowerCase(Locale.ROOT);
        for(char c : str.toCharArray()){
            if(c==t)
                ++answer;
        }
        System.out.println(answer);
    }
}
