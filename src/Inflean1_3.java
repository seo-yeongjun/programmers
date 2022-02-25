import java.util.Scanner;

public class Inflean1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String answer = "";
        for(String s: words){
            if(s.length()>answer.length())
                answer=s;
        }
        System.out.print(answer);
    }
}
