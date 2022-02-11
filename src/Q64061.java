import java.util.Stack;

public class Q64061 {
    public static void main(String[] args) {
        Solution64061 s = new Solution64061();
        System.out.println(s.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
}

class Solution64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<Integer>();
        for (int i = 0; i < moves.length; i++) {
            int line = moves[i] - 1;
            for (int x = 0; x < board.length; x++) {
                if (board[x][line] == 0) {
                    continue;
                }
                if (!basket.isEmpty() && basket.peek() == board[x][line]) {
                    basket.pop();
                    board[x][line] = 0;
                    answer+=2;
                } else {
                    basket.push(board[x][line]);
                    board[x][line] = 0;
                }
                break;
            }
        }
        return answer;
    }
}