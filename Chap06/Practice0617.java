import java.util.Scanner;

public class Practice0617 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final int student_num = 6;
        final int subject_num = 2;

        String[] subjectString = {"国語", "数学"};

        System.out.println("６人の２科目（国語・数学）の科目ごとの平均点、学生ごとの平均点を求めます。");
        int[][] tensu = new int[student_num][subject_num];

        for(int i = 0; i < student_num; i++){
            System.out.println( (i + 1) + "人目の点数");
            for(int j = 0; j < subject_num; j++){
                System.out.print(subjectString[j] + "：");
                tensu[i][j] = stdIn.nextInt();
            }
        }

        int[] student_sum = new int[student_num];
        int[] subject_sum = new int[subject_num];

        for(int i = 0; i < student_num; i++){
            for(int j = 0; j < subject_num; j++){
                student_sum[i] += tensu[i][j];
                subject_sum[j] += tensu[i][j];
            }
        }

        System.out.println("科目ごとの平均点");
        for(int i = 0; i < subject_num; i++){
            System.out.println(subjectString[i] + "：" + (subject_sum[i] / student_num));
        }

        System.out.println("学生ごとの平均点");
        for(int i = 0; i < student_num; i++){
            System.out.println( (i + 1) + "人目の学生：" + (student_sum[i] / subject_num));
        }
    }
}
