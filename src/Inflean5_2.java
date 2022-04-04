import java.util.LinkedList;
import java.util.Scanner;
/*
2. 괄호문자제거

설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.

예시 입력
(A(BC)D)EF(G(H)(IJ)K)LM(N)

예시 출력
EFLM
*/

public class Inflean5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder answer = new StringBuilder();
        String str = sc.nextLine();
        for (char c : str.toCharArray()) {
            switch (c) {
                case '(': {
                    stack.push(c);
                    break;
                }
                case ')': {
                    stack.pop();
                    break;
                }
                default:{
                    if(stack.isEmpty())
                        answer.append(c);
                }
            }
        }
        System.out.println(answer);
    }
}
