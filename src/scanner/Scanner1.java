package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자: " + str);

        System.out.print("점수를 입력하세요:");
        int intVlaue = scanner.nextInt();
        System.out.println("입력한 점수: " + intVlaue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
