import java.util.Scanner;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

class Algo90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] pointsArr = sc.nextLine().split(" ");

        // 得点をリストに格納
        List<Integer> points = new ArrayList<>();
        for(int i = 0; i < N * 5; i++){
            points.add(Integer.parseInt(pointsArr[i]));
        }

        // 得点を昇順に並べ替え
        Collections.sort(points);

        // 上からN個、下からN個取り除く
        for (int i = 0; i < N; i++){
            points.remove(0);
            points.remove(points.size() - 1);
        }

        // 平均点を計算して出力
        int sum = 0;
        for (int n : points){
            sum += n;
        }

        BigDecimal average = BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(points.size()), 15, RoundingMode.UP);
        System.out.println(average); 
    }
}
