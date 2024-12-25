class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = 0;
                
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > temp) {
                    temp = numbers[i] * numbers[j];
                }
            }
        }
        
        answer = temp;
        
        return answer;
    }
}