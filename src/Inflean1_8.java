import java.util.Scanner;

public class Inflean1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z,]","");
        String strReverse = String.valueOf(new StringBuilder(str).reverse());
        System.out.println(str);
    }
}