import java.util.*;
class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = {};
      Arrays.sort(strings);
      for(int i=0; i<strings.length;i++){
          for(int j=0; j<strings.length-1; j++){
              if(strings[j].charAt(n) > strings[j+1].charAt(n)){
                  String temp = strings[j];
                  strings[j] = strings[j+1];
                  strings[j+1] = temp;
              }
          }
      }
      answer=Arrays.copyOf(strings,strings.length);
      return answer;
  }
}