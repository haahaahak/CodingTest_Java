import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                if (!numbers.contains(i))
                    numbers.add(i);
                n /= i;
            }
        }
        
        if (n > 1) numbers.add(n);
        
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}