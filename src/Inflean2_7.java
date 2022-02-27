import java.util.Scanner;

public class Inflean2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int num = Integer.parseInt(sc.nextLine());
        String a = sc.nextLine();
        String[] b = a.split("0 ");
       if(b[b.length-1].charAt(b[b.length-1].length()-1)=='0')
           b[b.length-1]=b[b.length-1].substring(0,  b[b.length-1].length()-1);
        for(String str : b){
            if(str.equals(""))
                continue;
            else
               str=str.replace(" ", "");
            for(int i = 1; i<=str.length();i++){
                answer+=i;
            }
        }
        System.out.println(answer);
    }
}