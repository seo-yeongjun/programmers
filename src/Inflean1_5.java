import java.util.Scanner;

public class Inflean1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int start = 0; int end = chars.length-1;
        while (start<end){
            if(!Character.isAlphabetic(chars[start]))
                start++;
            if(!Character.isAlphabetic(chars[end]))
                end--;
            if(Character.isAlphabetic(chars[start])&&Character.isAlphabetic(chars[end])){
                char tmp = chars[start];
                chars[start]=chars[end];
                chars[end] = tmp;
                start++;
                end--;
            }
        }
        System.out.print(chars);
    }
}
