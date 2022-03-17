import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        String[] strs = new String[line];
        for (int i = 0; i < line; i++) {
            strs[i]="";
            for (int j = 0; j < line; j++) {
                strs[i]+=" ";
            }
        }

        for(int i =line-1;i>=0;i--){
            char[] chars=strs[i].toCharArray();
            for(int j=0;j<=i;j++){
                chars[line-1-j]='*';
            }
            strs[i]= String.valueOf(chars);
        }
        for(String str:strs){
            System.out.println(str);
        }
    }
}