import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q81302 {
    public static void main(String[] args) {
        Solution81302 s = new Solution81302();
        System.out.println(Arrays.toString(s.solution(new String[][]{{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "POXXP"}})));
    }
}

class Person {
    int x;
    int y;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution81302 {
    public int[] solution(String[][] places) {
        int[] answer = new int[]{1, 1, 1, 1, 1};
        int indexPlace = 0;
        //사람들 위치 저장 for문
        for(String[] place :places){
            List<Person> people = new ArrayList<Person>();
            int indexLine = 0;
            for(String line : place){
                for(int i=0; i<line.length(); i++){
                    if(line.charAt(i)=='P')
                    people.add(new Person(i,indexLine));
                }
                indexLine++;
            }
            //거리 두기 확인
            check:
            for(int i = 0; i<people.size()-1; i++){
              for(int j=i+1;j<people.size();j++){
                  Person a = people.get(i);
                  Person b = people.get(j);
                  //한칸 옆에 있는 경우
                  if((a.x==b.x&&a.y+1==b.y)||(a.y==b.y&&a.x+1==b.x)){
                      answer[indexPlace]=0;

                  }
                  //두칸 옆에 있는 경우
                 else if((a.x==b.x&&a.y+2==b.y&&place[a.y+1].charAt(a.x)!='X')||(a.y==b.y&&a.x+2==b.x&&place[a.y].charAt(a.x+1)!='X')){
                     answer[indexPlace]=0;
                 }
                 //대각선에 있는 경우
                  else if((a.x-1==b.x&&a.y+1==b.y&&!(place[a.y].charAt(a.x-1)=='X'&&place[a.y+1].charAt(a.x)=='X'))||(a.x+1==b.x&&a.y+1==b.y&&!(place[a.y].charAt(a.x+1)=='X'&&place[a.y+1].charAt(a.x)=='X'))){
                      answer[indexPlace]=0;
                      break check;
                  }
              }
            }

            indexPlace++;
        }
        return answer;
        }
    }
