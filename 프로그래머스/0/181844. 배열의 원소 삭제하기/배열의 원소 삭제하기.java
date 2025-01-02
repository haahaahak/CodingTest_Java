import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // HashSet에 삭제할 요소
        HashSet<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        // 삭제되지 않은 요소를 저장할 리스트
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            // deleteSet에 없는 요소만 추가
            if (!deleteSet.contains(num)) {
                result.add(num);
            }
        }

        // ArrayList를 int[] 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}