class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isComposite(i)) answer++;
        }
        
        return answer;        
    }
    
    private boolean isComposite(int num) {
        int cnt = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) cnt ++;
        }
        
        return (cnt >= 3) ? true : false;
    }
}