import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        
        String result = Arrays.stream(words)
            .distinct()
            .sorted(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()))
            .collect(Collectors.joining("\n"));
        
        System.out.print(result);
    }
}