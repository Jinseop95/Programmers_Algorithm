import java.util.ArrayList;
class Solution {
  public int[] solution(String msg) {
      int[] answer = {};
      ArrayList<String> list = new ArrayList<>();
      ArrayList<Integer> answerList = new ArrayList<>();
      
      for(int i=0; i<26; i++){
          char c = (char)('A'+i);
          String s = String.valueOf(c);
          list.add(s);
      }
      
      int idx = msg.length();
      while(msg.length() != 0){
          String w = msg.substring(0,idx);
          if(!list.contains(w)){
              idx--;
              continue;
          }
          String c ="";
          if(idx+1 >msg.length())
              c = msg.substring(0,msg.length());
          else
              c = msg.substring(0,idx+1);
          
          answerList.add(list.indexOf(w)+1);
          list.add(c);
          msg = msg.substring(idx);
          idx = msg.length();
      }
      
      answer = new int[answerList.size()];
      for(int i=0; i<answerList.size(); i++)
          answer[i] = answerList.get(i);
      
      return answer;
  }
}