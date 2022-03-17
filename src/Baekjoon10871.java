import java.util.Scanner;

public class Baekjoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = sc.nextInt();

       StringBuilder answer = new StringBuilder();

        for(int i=0; i<num;i++){
            int n = sc.nextInt();
            if(n<max)
                answer.append(n).append(" ");
        }
        System.out.print(answer.substring(0, answer.length()-1));
    }
}