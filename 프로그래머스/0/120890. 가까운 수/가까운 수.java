class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);
            int diff2 = Math.abs(answer - n);
            
            if (diff < diff2) {
                answer = array[i];
            }
            if (diff == diff2) {
                answer = Math.min(array[i], answer);
            }
            
        }
        
        return answer;
    }
}