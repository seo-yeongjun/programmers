import java.util.Scanner;

public class inflean1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = Integer.parseInt(sc.nextLine());
        for(int i=0;i<testNum;i++){
            String str =sc.nextLine();
            char[] s = str.toCharArray();
            for(int j =s.length-1;j>=0;j--){
                System.out.print(s[j]);
            }
            System.out.print('\n');
        }
    }
}