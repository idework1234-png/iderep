import java.util.Scanner;

class Algo110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NandX = sc.nextLine().split(" ");
        int N = Integer.parseInt(NandX[0]);
        int X = Integer.parseInt(NandX[1]);

        String[] action = sc.nextLine().split(" ");

        int answer = 0;
        for(int i = 0; i < N; i++){
            if(Integer.parseInt(action[i]) == X){
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
