class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      int sub = a - 1 ;
      int tot = 0;
      if(sub >  0){
          for(int i = 0; i< sub; i++){
              tot += mon[i];
          }
      }
      tot += b -1;
      answer = day[tot % 7];
      return answer;
  }
}