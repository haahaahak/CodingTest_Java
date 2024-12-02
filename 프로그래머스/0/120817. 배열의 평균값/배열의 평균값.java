class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int number = 0;
        
        for (int i=0; i<numbers.length; i++) {
            number += numbers[i];
        }
        
        answer = (double) number/numbers.length;
        
        return answer;
    }
}