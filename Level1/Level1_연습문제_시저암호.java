class Solution {
  public String solution(String s, int n) {
      String answer = "";
      char c = 'a';
      System.out.println((byte)' '); // 공백 문자 ASCII 값 확인
      
      for(int i =0; i<s.length(); i++){
          c = s.charAt(i);
          if(c == 32){
              answer +="";
          }else if(c <= 'Z'){
              c += (char)n;
              if(c> 'Z')
                  c -= 26;
          }else{
              c += (char)n;
              if(c>'z')
                  c -= 26;
          }
          answer += c;
      }
      return answer;
  }
}