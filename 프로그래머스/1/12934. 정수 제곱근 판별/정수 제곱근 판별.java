class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqr = (long)Math.sqrt(n);
        
        if ((sqr * sqr) == n) {
            answer = (sqr + 1) * (sqr + 1);
        } else {    
            answer = -1;
        }
        
        return answer;
    }
}