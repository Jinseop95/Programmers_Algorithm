import java.util.*;
class Solution {
  public int[] solution(int[] arr) {
      int[] answer = {};
      
      if(arr.length == 1)
          answer = new int[] {-1};
      else{
          answer = new int[arr.length-1];
          ArrayList<Integer> list = new ArrayList<>();
          for(int num : arr)
              list.add(num);
      
          int min = Collections.min(list);
          list.remove((Integer)min);
          
          if(list.isEmpty())
              answer[0] = -1;
          else{
              for(int i=0; i<list.size(); i++)
                  answer[i] = list.get(i);
          }
      }
      return answer;
  }
}