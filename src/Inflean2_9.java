import java.util.Scanner;

public class Inflean2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer =0 ;
        int[][] arr = new int[num][num];

        for(int i = 0; i<num; i++){
            int sum = 0;
            for(int j=0;j<num; j++){
                int read = sc.nextInt();
                arr[i][j]=read;
                sum+=read;
            }
            if(sum>answer)
                answer = sum;
        }

        for(int i = 0; i<num; i++){
          int sum=0;
            for(int j=0;j<num; j++){
             sum+=arr[j][i];
            }
         if(sum>answer)
             answer=sum;
        }

        int sum=0;
        for(int i = 0; i<num; i++){
            sum+=arr[i][i];
        }
        if(sum>answer)
            answer=sum;

        sum=0;
        int j = num-1;
        for(int i=0;i<num;i++){
            sum +=arr[i][j];
            j--;
        }
        if(sum>answer)
            answer = sum;

        System.out.print(answer);
    }
}