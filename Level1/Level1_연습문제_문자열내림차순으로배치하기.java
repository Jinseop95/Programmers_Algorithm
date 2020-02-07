import java.util.*; 
class Solution {
  public String solution(String s) {
      String answer = "";
      String[] arr = s.split("");
      Arrays.sort(arr, Collections.reverseOrder());
      for(int i=0; i<arr.length; i++){
          if(arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z'){
              
          }else{
              answer += arr[i];
              arr[i] = "";
          }
      }
      
      for(int i=0; i<arr.length; i++){
          answer += arr[i];
      }
      
      return answer;
  }
}