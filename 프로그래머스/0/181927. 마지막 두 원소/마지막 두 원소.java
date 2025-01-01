class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size + 1];
        
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i];
        }
        
        if (answer[size - 1] <= answer[size - 2]) answer[size] = answer[size - 1] * 2;
        if (answer[size - 1] > answer[size - 2]) answer[size] = answer[size - 1] - answer[size - 2];
        
        return answer;
    }
}