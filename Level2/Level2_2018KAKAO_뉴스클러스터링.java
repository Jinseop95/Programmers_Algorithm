import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
  public int cnt(ArrayList min, ArrayList max){
      double A =0.0;
      double B = 0.0;
      
      for(int i=0; i<min.size(); i++){
          if(max.contains(min.get(i))){
              A++;
              max.remove(min.get(i));
          }
      }
      B = min.size() + max.size();
      return (int)Math.floor(A/B*65536); 
  }
    
  public int solution(String str1, String str2) {
      int answer = 0;
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      
      ArrayList<String> list1 = new ArrayList<>();
      ArrayList<String> list2 = new ArrayList<>();
      
      Pattern pattern = Pattern.compile("^[a-z]+$");
      for(int i=0; i<str1.length()-1; i++){
          String tmp = "";
          if( i == str1.length()-1)
              tmp = str1.substring(str1.length()-1);
          else
              tmp = str1.substring(i,i+2);
          
          Matcher match = pattern.matcher(tmp);
          if(match.matches())
              list1.add(tmp);
      }
      
      for(int i=0; i<str2.length()-1; i++){
          String tmp = "";
          if( i == str2.length()-1)
              tmp = str2.substring(str2.length()-1);
          else
              tmp = str2.substring(i,i+2);
          
          Matcher match = pattern.matcher(tmp);
          if(match.matches())
              list2.add(tmp);
      }
            
      if(list1.isEmpty() && list2.isEmpty()){
          answer = 1*65536;
      }else{
          if(list1.size() < list2.size())
              answer = cnt(list1,list2);
          else
              answer = cnt(list2,list1);
      }
      
      return answer;
  }
}