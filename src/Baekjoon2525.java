import java.util.Scanner;

public class Baekjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String 시간 = sc.nextLine();
        String[] 시간s = 시간.split(" ");
        int 분 = Integer.parseInt(시간s[0])*60 + Integer.parseInt(시간s[1]);
        int add = sc.nextInt();
        분 +=add;
        분 %=1440;
        System.out.println(분/60+" "+분%60);
    }
}

