import java.util.Scanner;

public class Inflean1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str +=".";
        StringBuilder answer = new StringBuilder();
        int z =1;
        for(int i = 0 ; i<str.length()-1;i++){
            int j = 1;
            while(str.charAt(i)==str.charAt(i+j)){
                j++;
            }
            answer.append(str.charAt(i));
            answer.append(j);
            i=i+j-1;
        }
        System.out.println(answer.toString().replace("1", ""));
    }
}