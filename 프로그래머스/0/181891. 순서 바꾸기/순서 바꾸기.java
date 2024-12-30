import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int[] after = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] before = Arrays.copyOfRange(num_list, 0, n);
        
        int idx = 0;
        
        for (int i: after) {
            answer[idx] = i;
            idx++;
        }
        
        for (int j: before) {
            answer[idx] = j;
            idx++;
        }
        
        return answer;
    }
}