class Solution {
    public int solution(int[] array) {
        int answer = -1;
        
        int[] count = new int[1000];
        
        for (int num: array) {
            count[num]++;
        }
        
        int maxCount = 0;
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            }
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount && i != answer) {
                return -1;
            }
        }
        
        return answer;
    }
}