import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Algo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();

        // 今いる場所
        int x = 0;
        int y = 0;

        // 移動+場所の記録
        Set<String> place = new HashSet<>();
        place.add(x + " " + y);
        for (int i = 0; i < N - 1; i++){
            switch (S.substring(i, i+1)) {
                case "R":
                    x += 1;
                    place.add(x + " " + y);
                    break;
                case "L":
                    x -= 1;
                    place.add(x + " " + y);
                    break;                    
                case "U":
                    y += 1;
                    place.add(x + " " + y);
                    break;                      
                case "D":
                    y -= 1;
                    place.add(x + " " + y);
                    break;                  
                default:
                    break;
            }
        }

        // 同じ場所にいたことがあればplaceの要素数 < N
        if (place.size() < N){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }    
}
