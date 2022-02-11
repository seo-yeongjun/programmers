//https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
//한번에 한명 신고
//중복된 신고는 1회
//k번 이상 신고시 정지
// 정지 되면 신고 한 사람들에게 메일 발송

import java.util.*;

public class Q92334 {
    public static void main(String[] args) {
        int[] a = solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3);
        for (int s : a) {
            System.out.println(s);
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(6,4);
        ListIterator<Integer> i = list.listIterator(2);
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[][] lable = new int[id_list.length][id_list.length];
        for (String s : report) {
            String[] user = s.split(" ");
            System.out.println("신고자 :" + user[0]);
            System.out.println("범인 :" + user[1]);

            for (int j = 0; j < id_list.length; j++) {
                if (id_list[j].equals(user[0])) {
                    System.out.println("신고자 id: " + j + id_list[j]);
                    System.out.println("---------------------");
                    for (int l = 0; l < id_list.length; l++) {
                        if (id_list[l].equals(user[1]))
                            lable[l][j] += 1;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(lable));
        //i 신고 당한사람
        for (int i = 0; i < id_list.length; i++) {
            int sum = 0;
            for (int j = 0; j < id_list.length; j++) {
                if (lable[i][j] >= 1)
                    sum += 1;
            }
            if (sum >= k) {
                for (int l = 0; l < id_list.length; l++) {
                    if (lable[i][l] >= 1)
                        answer[l] += 1;
                }
            }
        }
        return answer;
    }
}
