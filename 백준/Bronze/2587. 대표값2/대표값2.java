import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 5개의 수를 입력받아 배열에 저장
        int[] arr = new int[5];
        int sum = 0; // 평균값을 구하기 위한 변수
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }
        
        // 2. 오름차순 정렬
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // 3. 평균값
        StringBuilder sb = new StringBuilder();
        sb.append(sum / 5).append("\n");
        
        // 4. 중앙값
        sb.append(arr[2]);
        
        // 5. 결과 출력
        System.out.print(sb);
    }
}