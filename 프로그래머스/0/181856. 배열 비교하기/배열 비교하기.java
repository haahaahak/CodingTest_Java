class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
                
        if (size1 != size2) {
            return size1 < size2 ? -1 : 1;
        }
        
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < size1; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        
        return Integer.compare(sum1, sum2);
    }
}