class Solution {
    public int solution(int[][] dots) {
        // 모든 두 점 쌍을 만들어 기울기를 비교
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        return 0;
    }

    // 두 직선이 평행한지 확인하는 메소드
    private boolean isParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        // 첫 번째 직선의 기울기
        int dx1 = dot2[0] - dot1[0];
        int dy1 = dot2[1] - dot1[1];

        // 두 번째 직선의 기울기
        int dx2 = dot4[0] - dot3[0];
        int dy2 = dot4[1] - dot3[1];

        // 기울기가 같은지 비교: dy1/dx1 == dy2/dx2 <=> dy1 * dx2 == dy2 * dx1
        return dy1 * dx2 == dy2 * dx1;
    }
}
