class Solution {
    public int solution(int[] ingredient) {
        int[] loop = new int[ingredient.length];
        
        int current = 0; // 현재 재료
        int count = 0; // 버거 숫자
        
        for (int ing: ingredient) {
            loop[current++] = ing;
            
            if (current >= 4 &&
                loop[current - 4] == 1 &&
                loop[current - 3] == 2 &&
                loop[current - 2] == 3 &&
                loop[current - 1] == 1) {
                
                current -= 4;
                count++;
            }
        }
        
        return count;
    }
}