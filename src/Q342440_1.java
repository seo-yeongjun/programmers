import java.util.Arrays;
import java.util.HashSet;

public class Q342440_1 {


    public static void main(String[] args) {
        Solution342440_1 s = new Solution342440_1();
        System.out.println(Arrays.toString(s.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }
}

class Solution342440_1 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        char 끝말 = words[0].charAt((0));
        HashSet<String> 한말들 = new HashSet<>();
        int 순서 = 1;
        int turn = 0;
        for (String word : words) {
            if (!한말들.add(word)) {
                answer[0] = 순서;
                answer[1] = turn + 1;
                return answer;
            } else if (끝말 != word.charAt(0)) {
                answer[0] = 순서;
                answer[1] = turn + 1;
                System.out.println(turn);
                return answer;
            }
            끝말 = word.charAt(word.length() - 1);
            ++순서;
            if (순서 == n + 1) {
                순서 = 1;
                ++turn;
            }
            System.out.println(끝말);
        }
        return answer;
    }
}

//1 일때
//+1
//2이일때
//+1
//*2
