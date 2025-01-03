class Solution {
    public int[] solution(int num, int total) {
        int sum = num * (num - 1) / 2;
        int start = (total - sum) / num;
        
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}