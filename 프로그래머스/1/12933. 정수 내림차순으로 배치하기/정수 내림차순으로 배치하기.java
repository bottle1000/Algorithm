class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        int length = str.length();
        int[] arrs = new int[length];
        
        for (int i = 0; i < length; i++) {
            arrs[i] = str.charAt(i) - '0';
        }
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arrs[i] < arrs[j]) {
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int arr : arrs) {
            sb.append(arr);
        }

        answer = Long.parseLong(sb.toString());
                
        return answer;
    }
}