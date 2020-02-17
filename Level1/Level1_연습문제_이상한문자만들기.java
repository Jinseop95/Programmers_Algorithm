class Solution {
  public String solution(String s) {
      String answer = "";
      String[] arr = s.split(" ",-1);
      
      for(int i=0; i<arr.length; i++){
          char[] chArr = arr[i].toCharArray();
          for(int j=0; j<chArr.length; j++){
              if(j % 2 == 0)
                  chArr[j] = Character.toUpperCase(chArr[j]);
              else
                  chArr[j] = Character.toLowerCase(chArr[j]);
          }
          
          for(char c : chArr)
              answer += c;
          if(i==arr.length-1)
              break;
          answer +=" ";
      }
      return answer;
  }
}