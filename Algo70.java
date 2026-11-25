import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Algo70{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // NとL
        String[] NandL = sc.nextLine().split(" ");
        int N = Integer.parseInt(NandL[0]); 
        int L = Integer.parseInt(NandL[1]); 

        // 配列｛学生1の各テストの点数, 学生2の各テストの点数, .., 学生L｝
        String[] tests = new String[L];
        for (int i = 0; i < L; i++){
            tests[i] = sc.nextLine();
        }

        // 多次元配列に格納　i→学生番号　j→テスト番号
        int[][] Student = new int[L][N];
        for(int i = 0; i < L; i++){
            String[] tmp = tests[i].split(" ");
            for(int j = 0; j < N; j++){
                Student[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        // テストごとに、学生の点数を比較 →　最高得点者をマップに格納
        Map<Integer, Integer> maxStudents = new HashMap<>();
        for (int j = 0; j < N; j++){
            int tmpMaxStudent = 1;
            int tmpMaxScore = Student[0][j];
            for (int i = 0; i < L; i++){
                if(Student[i][j] > tmpMaxScore){
                    tmpMaxStudent = i + 1;           // 学生番号は1から始まる
                    tmpMaxScore = Student[i][j];
                }
            }
            if(maxStudents.containsKey(tmpMaxStudent)){
                maxStudents.put(tmpMaxStudent, maxStudents.get(tmpMaxStudent) + 1);
            } else {
                maxStudents.put(tmpMaxStudent, 1);
            }
        }

        // 最多の学生とその回数を出力
        int AnswerStudent = 0;
        int AnswerNumber = 0;

        for(Map.Entry<Integer, Integer> entry : maxStudents.entrySet()){
            if (entry.getValue() > AnswerNumber) {
                AnswerStudent = entry.getKey();
                AnswerNumber = entry.getValue();
            }
        }

        System.out.printf("%d %d%n", AnswerStudent, AnswerNumber); 
    }
}