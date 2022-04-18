import java.util.ArrayList;
import java.util.Arrays;

//1478 → "one4seveneight"
public class Q81301 {
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("one4seveneight"));
    }
}
class Solution {
    public int solution(String s) {
        ArrayList<String> set = new ArrayList<String>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        for (String a : set) {
           s= s.replace(a, String.valueOf(set.indexOf(a)));
        }
        return Integer.parseInt(s);
    }
}
