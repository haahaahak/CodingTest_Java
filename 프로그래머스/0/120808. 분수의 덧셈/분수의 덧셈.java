class Solution {
    
    public int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        int gcdValue = gcd(numer, denom);

        answer[0] = numer/gcdValue;
        answer[1] = denom/gcdValue;
        
        return answer;
    }
}