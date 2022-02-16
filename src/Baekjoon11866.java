import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Baekjoon11866 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int lan = sc.nextInt();
        int num = sc.nextInt();
        for (int i = 1; i < lan+1; i++) {
            linkedList.add(i);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Integer t = (Integer) it.next();
            for(int i=0;i<num-1;i++){
                if (!it.hasNext()) {
                    it = linkedList.iterator();
                }
                t=(Integer) it.next();
            }
            sb.append(t).append(", ");
            it.remove();
            if (!it.hasNext()) {
                it = linkedList.iterator();
            }
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append('>');
        System.out.println(sb);
    }
}