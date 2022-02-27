import java.util.Scanner;

public class Inflean2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int before = 0;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<num; i++){
            int a = sc.nextInt();
            if(a>before)
                answer.append(a).append(' ');
            before=a;
        }
        System.out.println(answer.deleteCharAt(answer.length()-1));
    }
}