import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int testNum = sc.nextInt();
        for(int i=0;i<testNum+1;i++){
            String[] str = sc.nextLine().split(" ");
            switch (str[0]){
                case "push_front":
                    list.addFirst(Integer.valueOf(str[1]));
                    break;
                case "push_back":
                    list.addLast(Integer.valueOf(str[1]));
                    break;
                case "pop_front":
                    if (list.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(list.removeFirst()).append('\n');
                    break;
                case "pop_back":
                    if (list.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(list.removeLast()).append('\n');
                    break;
                case "size":
                    sb.append(list.size()).append('\n');
                    break;
                case "empty":
                    if(list.isEmpty())
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                case "front":
                    if (list.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(list.getFirst()).append('\n');
                    break;
                case "back":
                    if (list.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(list.getLast()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}