class Solution {
    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        
        if (size <= 1) return numbers;
        
        int[] answer = new int[size];
        
        if ("right".equals(direction)) {
            answer[0] = numbers[size - 1];
            for (int i = 1; i < size; i++) {
                answer[i] = numbers[i - 1];
            }
        }
        
        if ("left".equals(direction)) {
            answer[size - 1] = numbers[0];
            for (int i = 0; i < size - 1; i++) {
                answer[i] = numbers[i + 1];
            }
        }
                
        return answer;
    }
}