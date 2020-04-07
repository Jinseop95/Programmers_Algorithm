class Solution {
  public String toNumString(int num, int x){
      String s = "";
      String arr[] = {"A","B","C","D","E","F"};
      
      if(num == 0)
          return "0";
      
      while( num != 0){
          if(num % x >= 10)
              s = arr[(num%x)%10] + s;
          else
            s = (num % x) + s;
          num = num / x;
      }
      return s;
  }
    
  public String solution(int n, int t, int m, int p) {
      String answer = "";
      String str = "";
      int i = 0;
      
      while(str.length() < t*m){
          str += toNumString(i++, n);
      }
      
      for(int j=p-1; t>0; j=j+m){
          answer += str.charAt(j);
          t--;
      }
      return answer;
  }
}