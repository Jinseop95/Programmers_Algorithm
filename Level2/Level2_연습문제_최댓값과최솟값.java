class Solution {
  public String solution(String s) {
      String answer = "";
      String[] arr = s.split("\\p{Blank}");
      
      int max = Integer.parseInt(arr[0]);
      int min = Integer.parseInt(arr[0]);
      
      for(String a : arr){
          int num = Integer.parseInt(a);
          if(num > max)
              max = num;
          else if(num < min)
              min = num;
      }
      
      answer = min + " " + max;
      return answer;
  }
}