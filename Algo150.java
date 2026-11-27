import java.util.*;

class Algo150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NandK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NandK[0]);   // 人数
        int K = Integer.parseInt(NandK[1]);   // K位

        String[][] results = new String[N][3];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine(); 
            String[] tmp = line.split(" "); 
            for (int j = 0; j < 3; j++){
                results[i][j] = tmp[j];    
            }
        }

        Arrays.sort(results, Comparator.comparing(row -> row[0], String.CASE_INSENSITIVE_ORDER));
        Arrays.sort(results, Comparator.comparingInt(row -> Integer.parseInt(row[2])));
        Arrays.sort(results, Comparator.comparingInt((String[] row) -> Integer.parseInt(row[1])).reversed());

        System.out.println(results[K - 1][0]);
    }    
}
