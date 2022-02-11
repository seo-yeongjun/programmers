import java.util.*;

public class Q81303 {
    public static void main(String[] args) {
        Solution81303 s = new Solution81303();
        System.out.println(s.solution(8, 2, new String[]{"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"}));
    }
}

class Solution81303 {
    public String solution(int n, int k, String[] cmd) {
        LinkedList<Integer> deletes = new LinkedList<>();
        for (String line : cmd) {
            int plus = line.length() < 2 ? 0 : Integer.parseInt(line.substring(2));
            switch (line.charAt(0)) {
                case 'C':
                    deletes.push(k);
                    --n;
                    if (k == n)
                        --k;
                    break;
                case 'Z':
                    int index = deletes.pop();
                    if (index <= k)
                        ++k;
                    ++n;
                    break;
                case 'U':
                    k -= plus;
                    break;
                case 'D':
                    k += plus;
                    break;
            }
        }
        StringBuilder answer = new StringBuilder();
        answer.append("O".repeat(Math.max(0, n)));
        while (deletes.size() > 0) {
            int index = deletes.pop();
            answer.insert(index, 'X');
        }
        return answer.toString();
    }
}