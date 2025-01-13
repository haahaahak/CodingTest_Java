import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isValid(i)) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            return new int[]{-1};
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isValid(int num) {
        String str = String.valueOf(num);
        for (char ch : str.toCharArray()) {
            if (ch != '0' && ch != '5') {
                return false;
            }
        }
        return true;
    }
}