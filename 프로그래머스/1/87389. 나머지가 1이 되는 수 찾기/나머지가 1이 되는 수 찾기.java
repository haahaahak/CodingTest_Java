class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for (int i = answer; i <= n; i++) {
            if (n % i == 1) return i;
        }
        
        return answer;
    }
}