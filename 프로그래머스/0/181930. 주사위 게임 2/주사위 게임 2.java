class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int count = (a == b ? 1 : 0) + (b == c ? 1 : 0) + (a == c ? 1 : 0);
        
        int sum = a + b + c;
        int squareSum = sum * (a * a + b * b + c * c);
        int cubeSum = squareSum * (a * a * a + b * b * b + c * c * c);
        
        if (count == 0) answer = sum;
        if (count == 1) answer = squareSum;
        if (count == 3) answer = cubeSum;
        
        return answer;
    }
}