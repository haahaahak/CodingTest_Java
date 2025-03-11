import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 문자열로 입력받는다.
        String input = br.readLine();
        
        // 2. char 배열로 저장
        char[] arr = input.toCharArray();
        
        // 3. 선택정렬 (내림차순)
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] < arr[j]) {
                    idx = j;
                }
            }
            
            char temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        
        System.out.print(new String(arr));   
    }
}