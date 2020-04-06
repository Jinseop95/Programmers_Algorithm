import java.util.Arrays;
import java.util.Comparator;
class Solution {
  public String[] solution(String[] files) {
      String[] answer = {};
      
//       String str = files[0];
//       String head = str.split("[0-9]")[0];
//       String number = str.replaceAll("[^0-9]+","#").split("#")[1];
//       System.out.printf("head :%s, number :%s,\n", head, number);
      
      Arrays.sort(files, new Comparator<String>(){
          public int compare(String o1, String o2){
              String head1= o1.split("[0-9]")[0].toLowerCase();
              String head2= o2.split("[0-9]")[0].toLowerCase();
              int num1 = Integer.parseInt(o1.replaceAll("[^0-9]+","#").split("#")[1]);
              int num2 = Integer.parseInt(o2.replaceAll("[^0-9]+","#").split("#")[1]);
              
              if(head1.compareTo(head2) > 0)
                  return 1;
              else if(head1.compareTo(head2) == 0){
                  if(num1 > num2)
                      return 1;
                  else if(num1 == num2){
                      return 0;
                  }else
                      return -1;
              }else
                  return -1;
          }
      });
      
      answer = new String[files.length];
      for(int i=0; i<files.length; i++)
          answer[i] = files[i];
      
      return answer;
  }
}