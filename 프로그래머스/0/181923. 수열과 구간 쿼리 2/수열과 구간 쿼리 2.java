class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            int minVal = Integer.MAX_VALUE;
            
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minVal) {
                    minVal = arr[i];
                }
            }
            
            answer[q] = (minVal == Integer.MAX_VALUE) ? -1 : minVal;
        }
        
        return answer;
    }
}