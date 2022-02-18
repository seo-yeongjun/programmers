import java.util.Scanner;

public class Baekjoon4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a;
        while ((a = sc.nextInt()) != 0) {
            int b = a * 2;
            int answer=0;
            for(int i=a+1;i<=b;i++){
                if(make_prime(i)!=0)
                    answer++;
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }

    public static int make_prime(int number) {

        if(number < 2)
            return 0;
        if(number == 2)
            return number;


        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
                return 0;
        }
        return number;
    }

}

