class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int multi = 1;
        
        for (int i: num_list) {
            add += i;
            multi *= i;
        }
        
        add *= add;
        
        return multi < add ? 1 : 0;
    }
}