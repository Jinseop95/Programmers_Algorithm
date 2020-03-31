import java.util.*;
class Solution {
  public int solution(int cacheSize, String[] cities) {
      int answer = 0;
      Queue<String> queue = new LinkedList<>();
      
      if(cacheSize == 0){
          answer = cities.length * 5;
      }else{
          for(int i=0; i<cities.length; i++){
              String tmp = cities[i].toLowerCase();
              if(queue.size() < cacheSize){
                  if(queue.contains(tmp)){
                      queue.remove(tmp);
                      queue.offer(tmp);
                      answer += 1;
                  }else{
                      queue.offer(tmp);
                      answer += 5;
                  }
              }else{
                  if(queue.contains(tmp)){
                      queue.remove(tmp);
                      queue.offer(tmp);
                      answer += 1;
                  }else{
                      queue.poll();
                      queue.offer(tmp);
                      answer += 5;
                  }
              }

            }
          }
      return answer;
  }
}