class Solution {
  public int solution(int n) {
      int answer = 1;
      
      // if(n<2)
      //     answer = n;
      // else
      //     answer = solution(n-1) + solution(n-2);
      int result1 = 0;
      int result2 = 1;      
      
      if(n<2)
          answer = n;
      
      for(int i=0; i<n-2; i++){
          result1 = result2 % 1234567;
          result2 = answer % 1234567;
          answer = (result1 + result2)% 1234567;
      }
      
      return answer;
  }
}