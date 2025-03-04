import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        
        int cross = 1;
        int sum = 1;
        
        while (sum < X) {
            cross++;
            sum += cross;
        }
        int k = X - (sum - cross);
        int nume, denom;
        
        if (cross % 2 == 0) {
            nume = k;
            denom = (cross - k + 1);
        } else {
            nume = (cross - k + 1);
            denom = k;
        }
        
        System.out.print(nume + "/" + denom);
    }
}