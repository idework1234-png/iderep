import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Algo80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        // NとQを格納
        String[] NandQ = line.split(" ");
        int N = Integer.parseInt(NandQ[0]);
        int Q = Integer.parseInt(NandQ[1]);

        // 各イベントを格納
        String[] eventArr = new String[Q];
        for (int i = 0; i < Q; i++){
            eventArr[i] = sc.nextLine();
        }

        // 各イベントを判定
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < Q; i++){
            String event = eventArr[i].substring(0, 1);
            String player = eventArr[i].substring(2, 3);
            switch (event) {
                case "1":
                    if(map.containsKey(player)){
                        map.put(player, map.get(player) + 1);
                    } else {
                        map.put(player, 1);
                    }
                    break;
                case "2":
                    if(map.containsKey(player)){
                        map.put(player, map.get(player) + 2);
                    } else {
                        map.put(player, 2);
                    } 
                    break;           
                case "3":
                    if(map.containsKey(player)){
                        if(map.get(player) >= 2){
                            answer.add("YES");
                        } else {
                            answer.add("NO");
                        }
                    } else {
                        answer.add("NO");
                    }
                    break;
                default:
                    break;
            }
        }

        // 答えを出力
        for (int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }        
    }
}
