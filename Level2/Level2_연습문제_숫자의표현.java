class Solution {
  public int solution(int n) {
      int answer = 0;
      int total = 0;
      
      int num = 0;
      
      while(num<n){
          num++;
          total = n;
          for(int i=num; i<=n; i++){
              total -= i;
              if(total == 0){
                  answer++;
                  break;
              }else if(total < 0){
                  break;
              }
          }
      }
      return answer;
  }
}