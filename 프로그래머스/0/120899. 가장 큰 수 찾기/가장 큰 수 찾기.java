class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = 0;
        int index = 0;
        
        for (int i: array) {
            if (answer[0] < i) {
                answer[0] = i;
                answer[1] = index;
            }
            index++;
            
        }
        
        return answer;
    }
}