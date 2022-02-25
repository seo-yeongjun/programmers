import java.util.Scanner;

public class Inflean1_2 {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       StringBuilder answer = new StringBuilder();
       for(char c : str.toCharArray()){
        if(Character.isLowerCase(c))
            answer.append(Character.toUpperCase(c));
        else
            answer.append(Character.toLowerCase(c));
       }
        System.out.print(answer);
    }
}
