import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            if(hm.containsKey(clothes[i][1])){
                int tmp = hm.get(clothes[i][1]);
                hm.put(clothes[i][1], tmp+1);
            }else{
                hm.put(clothes[i][1],1);
            }
        }
        
        Collection<Integer> values = hm.values();
        Iterator it = values.iterator();
        
         while(it.hasNext()){
             int num = (int)it.next();
             answer *= (num+1);   //옷가지수 + 안입을경우
        }       

        return answer-1;    //모두 다 안입는경우 제외
    }
}