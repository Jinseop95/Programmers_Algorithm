class Solution {
  public int solution(String dartResult) {
      int answer = 0;      
      String strScore = "";         
      int[] score = new int[3];     //시도별 점수
      int k= -1;
      for(int i=0; i<dartResult.length();i++){
          char c = dartResult.charAt(i);
          if(c >='0' && c <='9'){
              if(strScore == "")
                  k++;
              strScore += c;
          }else{
              if(strScore != ""){
                  score[k] = Integer.parseInt(strScore);
                  if( c== 'D'){
                      score[k] = (int)Math.pow(score[k],2);
                  }else if( c== 'T'){
                      score[k] = (int)Math.pow(score[k],3);
                  }
              }else{
                 if( c == '*'){
                     if(k != 0)
                         score[k-1] *= 2;
                     score[k] *= 2;
                  }else if(c == '#'){
                     score[k] *= -1;
                  } 
              }
              strScore ="";
          }
      }
      
      for(int num : score)
          answer += num;
      return answer;
  }
}