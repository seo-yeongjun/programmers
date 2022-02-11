import java.util.HashMap;

public class Q67256 {
    public static void main(String[] args) {
        Solution67256 s = new Solution67256();
        System.out.println(s.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    }
}

class XY {
    int x;
    int y;

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution67256 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        HashMap<String, XY> map = new HashMap<String, XY>();
        map.put("*", new XY(0, 0));
        map.put("0", new XY(1, 0));
        map.put("#", new XY(2, 0));
        map.put("7", new XY(0, 1));
        map.put("8", new XY(1, 1));
        map.put("9", new XY(2, 1));
        map.put("4", new XY(0, 2));
        map.put("5", new XY(1, 2));
        map.put("6", new XY(2, 2));
        map.put("1", new XY(0, 3));
        map.put("2", new XY(1, 3));
        map.put("3", new XY(2, 3));
        //현재 왼손 위치
        String l = "*";
        //현재 오른손 위치
        String r = "#";
        for (int n : numbers) {

            if (n == 1 || n == 4 || n == 7) { //번호가 좌측일 때
                answer += "L";
                l = String.valueOf(n);
            } else if (n == 3 || n == 6 || n == 9) { //번호가 우측일 때
                answer += "R";
                r = String.valueOf(n);
            } else { //번호가 중앙일 때
                XY goal = map.get(String.valueOf(n));
                XY rXY = map.get(String.valueOf(r));
                XY lXY = map.get(String.valueOf(l));
                int lLen = 0;
                int rLen = 0;
                //왼손 거리 구하기
                if (goal.x > lXY.x) {
                    lLen += goal.x - lXY.x;
                } else if (goal.x < lXY.x) {
                    lLen += lXY.x - goal.x;
                }
                if (goal.y > lXY.y) {
                    lLen += goal.y - lXY.y;
                } else if (goal.y < lXY.y) {
                    lLen += lXY.y - goal.y;
                }
                //오른손 거리 구하기
                if (goal.x > rXY.x) {
                    rLen += goal.x - rXY.x;
                } else if (goal.x < rXY.x) {
                    rLen += rXY.x - goal.x;
                }
                if (goal.y > rXY.y) {
                    rLen += goal.y - rXY.y;
                } else if (goal.y < rXY.y) {
                    rLen += rXY.y - goal.y;
                }

                if (lLen > rLen) {
                    answer += "R";
                    r = String.valueOf(n);
                } else if (lLen < rLen) {
                    answer += "L";
                    l = String.valueOf(n);
                } else { //거리가 같을 때
                    if (hand.equals("right")) {
                        answer += "R";
                        r = String.valueOf(n);
                    } else {
                        answer += "L";
                        l = String.valueOf(n);
                    }
                }

            }
        }
        return answer;
    }
}