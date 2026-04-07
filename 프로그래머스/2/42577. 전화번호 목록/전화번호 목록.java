import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String number : phone_book) {
            map.put(number, 1);
        }
        
        for(String number : phone_book) {
            for(int i = 1; i < number.length(); i++){ // 자기 자신을 포함하면 안되니깐..
                if(map.containsKey(number.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}