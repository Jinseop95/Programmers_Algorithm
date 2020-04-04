import java.text.SimpleDateFormat;
import java.util.Date;
class Solution {
  public String solution(String m, String[] musicinfos) {
      String answer = "";
      //A# C# D# F# G#
      //1 2 3 4 5 바꿈
      m = m.replaceAll("A#","1").replaceAll("C#","2").replaceAll("D#","3").replaceAll("F#","4").replaceAll("G#","5");
      long time = 0; //시간 비교      
      for(String str : musicinfos){
          String[] tmp = str.split(",");
          SimpleDateFormat df = new SimpleDateFormat("HH:mm");
          try{
              Date start = df.parse(tmp[0]);
              Date end = df.parse(tmp[1]);
              long min = (end.getTime() - start.getTime()) / 60000;  //1000밀리는 1초, 
              String title = tmp[2];
              String melody = tmp[3].replaceAll("A#","1").replaceAll("C#","2").replaceAll("D#","3").replaceAll("F#","4").replaceAll("G#","5");
              String code = "";
              for(int i=0; i< min / melody.length(); i++)
                  code += melody;
              code += melody.substring(0, (int)min % melody.length());
              
              if(code.contains(m)){
                  if(time < min){
                      answer = title;
                      time = min;
                  }
              }
          }catch(Exception e){}
      }
      
      if(answer.equals(""))
          answer = "(None)";
      return answer;
  }
}