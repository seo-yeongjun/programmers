import java.util.*;

public class Q42576_Hash {


    public static void main(String[] args) {
        Solution42576_Hash s = new Solution42576_Hash();
        System.out.println(s.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
}

class Solution42576_Hash {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            if (map.containsKey(name))
                map.put(name, 1 + map.get(name));
            else
                map.put(name, 1);
        }
        for (String name : completion)
            map.put(name, map.get(name) - 1);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}