import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Baekjoon5430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[^\\w]+");
        int testNum = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        label:
        for (int i = 0; i < testNum; i++) {
            String input = sc.next();
            LinkedList<Integer> list = new LinkedList<>();
            int arrSize = sc.nextInt();
            for (int j = 0; j < arrSize; j++) {
                list.add(sc.nextInt());
            }
            int tmp = 0;
            for (int j = 0; j < input.length(); j++) {
                switch (input.charAt(j)) {
                    case 'R':
                        if (tmp == 0)
                            tmp = 1;
                        else
                            tmp = 0;
                        break;
                    case 'D':
                        if (list.isEmpty()) {
                            answer.append("error").append('\n');
                            continue label;
                        } else if (tmp == 0)
                            list.removeFirst();
                        else
                            list.removeLast();
                        break;
                }
            }
            if (tmp == 0) {
                Iterator<Integer> it = list.iterator();
                answer.append('[');
                while (it.hasNext()) {
                    answer.append(it.next()).append(",");
                }
                if (answer.charAt(answer.length() - 1) == ',')
                    answer.delete(answer.length() - 1, answer.length());
                answer.append(']').append('\n');
            } else {
                ListIterator<Integer> it = list.listIterator(list.size());
                answer.append('[');
                while (it.hasPrevious()) {
                    answer.append(it.previous()).append(",");
                }
                if (answer.charAt(answer.length() - 1) == ',')
                    answer.delete(answer.length() - 1, answer.length());
                answer.append(']').append('\n');
            }
        }
        answer.delete(answer.length() - 1, answer.length());
        System.out.print(answer);
    }
}

