import java.util.Scanner;

class Algo60{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String ALine = sc.nextLine();
        String BLine = sc.nextLine();

        // AとBの得点を配列に格納
        String[] A = ALine.split(" ");
        String[] B = BLine.split(" ");
    
        //得点差を計算 出力
        String answer = String.valueOf(Integer.parseInt(A[0]) - Integer.parseInt(B[0]));
        for(int i = 1; i < N; i++){
            answer = answer + " " + String.valueOf(Integer.parseInt(A[i]) - Integer.parseInt(B[i]));
        }
        System.out.println(answer);

    }
}