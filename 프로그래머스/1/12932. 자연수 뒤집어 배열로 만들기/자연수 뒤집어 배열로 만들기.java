class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = Long.toString(n);
        answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}