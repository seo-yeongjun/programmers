import java.sql.SQLOutput;
import java.util.ArrayList;

public class Q342440 {


    public static void main(String[] args) {
        Solution342440 s = new Solution342440();
        System.out.println(s.solution(5000));
    }

}

class Solution342440 {
    public int solution(int n) {
        int ans = 1;
        int num = n;
        while (num != 1) {
            if (num % 2 != 0) {
          ++ans;
          --num;
                System.out.println(num);
            }else{
                num=num/2;
                System.out.println(num);
            }
        }
        return ans;
    }
}

//1 일때
//+1
//2이일때
//+1
//*2
