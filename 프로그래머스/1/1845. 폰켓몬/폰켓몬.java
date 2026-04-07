import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int maxPick = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        int typeCount = set.size();
        
        
        
        return Math.min(typeCount, maxPick);
    }
}