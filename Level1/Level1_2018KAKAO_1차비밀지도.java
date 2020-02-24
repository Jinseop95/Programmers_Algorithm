class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = {};
      answer = new String[n];
      String fmt = "%"+n+"s";
      
      for(int i =0; i< n; i++){
          answer[i] = String.format(fmt,Integer.toBinaryString(arr1[i] | arr2[i]));
          // while(answer[i].length() < n){
          //     answer[i] = "0" + answer[i];                 
          // }
          
          answer[i] = answer[i].replace("1","#");
          answer[i] = answer[i].replace("0"," ");   
      }
      return answer;
  }
}