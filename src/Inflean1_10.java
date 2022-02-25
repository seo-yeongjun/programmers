import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inflean1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int index = strings[0].indexOf(strings[1].charAt(0));index>=0;index=strings[0].indexOf(strings[1].charAt(0),index+1)){
            list.add(index);
        }
        StringBuilder answer = new StringBuilder();
        for(int i =0; i<strings[0].length();i++){
            Iterator<Integer> it = list.iterator();
            int idx = 102;
            while (it.hasNext()){
                int a =  it.next();
                if(Math.abs(i-a)<idx)
                    idx=Math.abs(i-a);
            }
            answer.append(idx).append(' ');
        }
        System.out.print(answer.deleteCharAt(answer.length()-1));

    }
}