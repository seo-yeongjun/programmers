import java.util.*;

public class Inflean2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int[][] arr = new int[num][5];
       int[][] answerImp = new int[num][num];
       for(int i =0; i<num; i++){
           for(int j = 0; j<5; j++){
               arr[i][j] = sc.nextInt();
           }
       }
   for(int i = 0 ; i<num-1; i++){
       for(int j=i+1;j<num;j++){
           for(int k = 0; k<5; k++){
               if(arr[i][k]==arr[j][k]){
                   answerImp[i][j]=1;
                   answerImp[j][i]=1;
               }
           }
       }
   }
   int max = 0;
   int index= 1;
   int answer = 0;
      for(int[] a:answerImp){
          if(Arrays.stream(a).sum()>max){
              max=Arrays.stream(a).sum();
              answer = index;
          }
          index++;
      }
      if(answer==0)
          System.out.println(1);
      else
        System.out.print(answer);
    }
}