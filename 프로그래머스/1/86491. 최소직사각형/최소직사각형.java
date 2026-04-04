import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        // 처음부터 가로, 세로를 정의하지 말고 [x1, x2] 중에 큰 놈을 가로, 작은 놈을 세로로 정의하고 
        // 이제 정의된 가로와 세로 중 최대값들을 찾으면 될 듯..?
        
        int wMax = 0;
        int hMax = 0;
        
        for(int[] card : sizes) {
            int longer = Math.max(card[0], card[1]);
            int shorter = Math.min(card[0], card[1]);
            
            wMax = Math.max(wMax, longer);
            hMax = Math.max(hMax, shorter);
        }
        
        
        return wMax * hMax;
    }
}