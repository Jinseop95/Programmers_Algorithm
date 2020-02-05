import java.util.*;
class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] answer = {};
      ArrayList<Integer> arrList = new ArrayList<>();
      
      for(int num : arr){
          if(num % divisor == 0) {
              arrList.add(num);
          } 
      }
      if(arrList.isEmpty()){
          answer = new int[] {-1};
      }else{
          Collections.sort(arrList);
          answer = new int[arrList.size()];
          for(int i=0; i<arrList.size(); i++){
              answer[i] = arrList.get(i);
          }
      }
      return answer;
  }
}