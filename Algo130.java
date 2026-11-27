import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Algo130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NandM = sc.nextLine().split(" ");
        int N = Integer.parseInt(NandM[0]);
        int M = Integer.parseInt(NandM[1]);

        // 価格と予算を格納
        String[] tmp = sc.nextLine().split(" ");
        String[] money = sc.nextLine().split(" ");

        // 価格は降順で整理
        List<Integer> price = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            price.add(Integer.parseInt(tmp[i]));
        }
        price.sort(Comparator.reverseOrder());;

        // 価格と予算を比較
        int sales = 0;
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                if(Integer.parseInt(money[i]) >= price.get(j)){
                    sales += price.get(j);
                    break;
                }
            }
        }
        System.out.println(sales);
    }
}
