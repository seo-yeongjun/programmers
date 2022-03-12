import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Inflean2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int students = Integer. parseInt(a.split(" ")[0]);
        int testNum = Integer. parseInt(a.split(" ")[1]);
        HashMap<Integer,LinkedList<Integer>> list = new HashMap<>();
        for(int i =0; i<testNum; i++){
            String str = sc.nextLine();
            String[] line = str.split(" ");
            for(int j=0; j<line.length; j++){
                LinkedList<Integer> f = new LinkedList<>();
                for(int k=j+1;k< line.length; k++){
                        f.add(Integer.valueOf(line[k]));
                }
                if(list.containsKey(Integer.parseInt(line[j]))){
                    f.retainAll(list.get(Integer.parseInt(line[j])));
                }
                list.put(Integer.parseInt(line[j]),f);
            }
        }
        AtomicInteger answer= new AtomicInteger();
        list.forEach((key,value) -> answer.addAndGet(value.size()));
        System.out.println(answer);
    }
}