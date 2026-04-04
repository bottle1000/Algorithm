import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                queue.offer(arr[i]);
            }
        }
        
        int[] answer = new int[queue.size()];
        
        int index = 0;
        while(!queue.isEmpty()) {
            answer[index++] = queue.poll();
        }

        return answer;
    }
}