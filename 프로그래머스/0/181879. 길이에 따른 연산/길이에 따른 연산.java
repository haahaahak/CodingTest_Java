class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length >= 11) ? 0 : 1;

        for (int i : num_list) {
            answer = (num_list.length >= 11) ? answer + i : answer * i;
        }

        return answer;
    }
}