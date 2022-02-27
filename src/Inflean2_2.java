import java.util.Scanner;

public class Inflean2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int before = 0;
        int answer =0;
        for(int i = 0; i<num; i++){
            int a = sc.nextInt();
            if(a>before)
                answer+=1;
            before=Math.max(before, a);
        }
        System.out.println(answer);
    }
}