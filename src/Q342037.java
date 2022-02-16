import java.util.ArrayList;

public class Q342037 {

}
class Solution342037 {
    public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        for(int i : nums){
            if(!list.contains(i)){
                list.add(i);
            ++answer;
            }
        }
        return Math.min(answer, nums.length / 2);
    }
}