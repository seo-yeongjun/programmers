import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int answer=0;
      for(int i=0;i<num;i++){
          int a = sc.nextInt();
          int tmp = 0;
          for(int j=1;j<=a;j++){
              if(a%j==0){
                  tmp++;
              }
          }
          if(tmp==2)
              ++answer;
      }
        System.out.println(answer);
    }
}