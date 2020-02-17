class Solution {
  public long solution(long n) {
      long answer = 0;
      long num =0;
      
      num = (long)Math.sqrt(n);
      
      if(Math.pow(num,2) == n)
          answer = (num+1)*(num+1);
      else
          answer = -1;
      
      return answer;
  }
}