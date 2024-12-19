import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        
        int[] answer = new int[count];
        
        int idx = 0;
        
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                answer[idx] = j;
                idx++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}