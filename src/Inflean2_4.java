import java.util.Scanner;

public class Inflean2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int before = 1;
        int before2 = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("1 1 ");
        for(int i= 0 ; i<num-2; i++){
            int next = before+before2;
            sb.append(next).append(' ');
            before = before2;
            before2 = next;
        }
        System.out.print(sb.deleteCharAt(sb.length()-1));
    }
}