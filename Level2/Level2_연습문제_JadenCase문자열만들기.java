class Solution {
  public String solution(String s) {
      String answer = "";
      String[] arr = s.split("\\s",-1); //마지막 요소가 빈문자열일 경우 포함
      
      for(int i=0; i<arr.length; i++){
          if(arr[i].equals("")){
              answer += "";
          }else{
              String str = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1, arr[i].length()).toLowerCase();
              answer = answer + str;
          }
          if(i != arr.length-1)
              answer += " ";
      }
      return answer;
  }
}