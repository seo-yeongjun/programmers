import java.util.*;

public class Baekjoon1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
      for(int i=0; i<testNum;i++){
          LinkedList<Document> list = new LinkedList<>();
          int num = sc.nextInt();
          int 궁금 = sc.nextInt();
          ArrayList<Integer> 중요 = new ArrayList<>();
          for(int j=0;j<num;j++){
              int 중요도 = sc.nextInt();
              list.add(new Document(j,중요도));
              중요.add(중요도);
          }
          Collections.sort(중요, Collections.reverseOrder());
          int answer = 0;
         while (true){
             Document d = list.pop();
             if(d.중요도<중요.get(0)){
                 list.add(d);
             }else{
                 if(d.index==궁금){
                     break;
                 }
                 ++answer;
                중요.remove(0);

             }
          }
          System.out.println(answer+1);
      }
    }
}
class Document{
    int index;
    int 중요도;
    Document(int index, int 중요도){
        this.index=index;
        this.중요도=중요도;
    }
}

