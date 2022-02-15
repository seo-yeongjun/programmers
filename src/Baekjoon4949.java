import java.util.*;

public class Baekjoon4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine();
            if (str.equals("."))
                break;
            System.out.println(Baekjoon4949.answer(str));
        }
    }

    static String answer(String s) {
        String answer = "";
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        return "no";
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        return "no";
                    break;
            }
        }
        if(stack.isEmpty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}

