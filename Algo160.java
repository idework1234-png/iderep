import java.util.*;

class Algo160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 各タスクの制限時間をリストに昇順で格納
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int totalTime = 0;
        int task = 0;
        for (int i = 0; i < N; i++) {
            if(list.get(i) > totalTime){
                task += 1;
                totalTime += 1;
            }
        }

        System.out.println(task);

    }
}
