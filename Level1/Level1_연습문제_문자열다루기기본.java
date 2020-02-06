import java.util.*;
class Solution {
  public boolean solution(String s) {
      boolean answer = true;
      if(s.length() == 4 || s.length() == 6){
          for(int i=0; i<s.length(); i++){
              char a = s.charAt(i);
              if(Character.isDigit(a) == false){
                  answer = false;
                  break;
              }
          }
      }else{
          answer = false;
      }
      return answer;
  }
}