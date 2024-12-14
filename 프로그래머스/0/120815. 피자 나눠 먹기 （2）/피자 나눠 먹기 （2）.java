class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = n * 6 / gcd(n, 6);
        
        return answer / 6;
    }
    
    public int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}