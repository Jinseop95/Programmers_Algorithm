class Solution {
  public int solution(int num) {
      int answer = 0;
      long number = num;
      int cnt = 0;
      
      while(true){
          if(cnt == 500){
              answer = -1;
              break;
          }
          if(number == 1){
              answer = cnt;
              break;
          }else{
              cnt++;
              if(number % 2 == 0)
                  number = number / 2;
              else
                  number = number*3 + 1;
          }
      }
      
      return answer;
  }
}