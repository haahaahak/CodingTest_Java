import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 입력 받기
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 2. 입력 받은 값 배열에 저장 (원본, 정렬)
        int[] org = new int[N];
        int[] sorted = new int[N];
        for (int i = 0; i < N; i++) {
            org[i] = Integer.parseInt(st.nextToken());
            sorted[i] = org[i];
        }
        
        // 3. 정렬
        Arrays.sort(sorted);
        
        // 4. 좌표압축 배열
        int[] compressed = new int[N];
        int index = 0;

        compressed[0] = index;
        for (int i = 1; i < N; i++) {
            if (sorted[i] != sorted[i - 1]) {
                index++;
            }
            compressed[i] = index;
        }

        // 원본 배열의 좌표에 대한 압축 값 찾기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int pos = binarySearch(sorted, org[i]);
            sb.append(compressed[pos]).append(" ");
        }

        // 출력
        System.out.println(sb.toString());
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}