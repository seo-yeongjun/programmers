import java.util.*;

public class Inflean3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int num = sc.nextInt();
            for (int j = 0; j < num; j++) {
                list.add(sc.nextInt());
            }
        }
        Collections.sort(list);
        String answer = list.toString();
        System.out.println(answer.substring(1, answer.length() - 1).replace(",", ""));
    }
}