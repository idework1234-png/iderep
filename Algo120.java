import java.util.Scanner;

class Algo120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        // マス目の数字を２次元配列に格納
        String[] Arr1 = new String[N];
        String[][] Arr2 = new String[N][N];

        for (int i = 0; i < N; i++){
            Arr1[i] = sc.nextLine();            // {0行目の数字, 1行目の数字,   , N-1行目の数字}
            String[] tmp = Arr1[i].split(" ");  // i行目 {(i,0), (i,1),  , (i,n-1)}

            for (int j = 0; j < N; j++){
                Arr2[i][j] = tmp[j];            //   0行目{(0,0), (0,1),  , (0,n-1)}
            }                                   //   i行目{(i,0), (i,1),  , (i,n-1)}
        }                                       // n-1行目{(n-1,0), (n-1,1),  , (n-1,n-1)}

        // マス目の数字を足し上げる
        int total = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(j == i || j + i == N - 1){
                    total += Integer.parseInt(Arr2[i][j]);
                }
            }
        }

        // 解答出力
        System.out.println(total);
    }
}
