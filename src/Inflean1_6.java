import java.util.*;

public class Inflean1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        String answer = set.toString().replace(", ","");
        System.out.println(answer.substring(1, answer.length()-1));
    }
}
