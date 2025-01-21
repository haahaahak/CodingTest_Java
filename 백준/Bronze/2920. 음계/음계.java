import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        // 정수 배열로 변환
        int[] arr = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        
        boolean asc = true;
        boolean des = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                des = false;
            } else if (arr[i] > arr[i + 1]) {
                asc = false;
            }
        }
        
        if (asc) {
            System.out.print("ascending");
        } else if (des) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}