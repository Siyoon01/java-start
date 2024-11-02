package array.ex;

import java.util.Scanner;

public class ArrayDiEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};

        System.out.print("학생 수를 입력하세요:");
        int students = scanner.nextInt();

        int[][] score = new int[students][3];
        int[] sum = new int[students];
        double[] average = new double[students];

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            int sumScore = 0;
            int aveScore;
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                score[i][j] = scanner.nextInt();
                sumScore += score[i][j];
            }
            sum[i] = sumScore;
            average[i] = (double) sumScore / subjects.length;
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(i + "번 학생의 1총점: " + sum[i] + ", 평균: " + average[i]);
        }
    }
}
