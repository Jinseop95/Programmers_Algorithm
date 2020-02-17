import java.util.*;
class Solution {
  public long solution(long n) {
      long answer = 0;
      String[] arr = String.valueOf(n).split("");
      String str ="";
      
      Arrays.sort(arr,Collections.reverseOrder());
      
      for(String s : arr)
          str += s;
      
      answer = Long.parseLong(str);
      
      return answer;
  }
}