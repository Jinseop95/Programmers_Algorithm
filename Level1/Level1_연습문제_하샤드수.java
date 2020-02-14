class Solution {
  public boolean solution(int x) {
      boolean answer = true;
      int num = x;
      int total =0;

      while( x/10 != 0){
          total += x % 10;
          x = x/10;
      }
      total += x;
      
      if( num % total != 0)
          answer = false;
      return answer;
  }
}