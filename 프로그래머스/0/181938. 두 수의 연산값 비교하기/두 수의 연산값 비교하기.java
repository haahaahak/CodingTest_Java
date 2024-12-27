class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int abMulti = 2 * a * b;
        
        return ab >= abMulti ? ab : abMulti;
    }
}