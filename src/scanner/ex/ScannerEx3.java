package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();

        System.out.print("음식의 가격을 입력하세요: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식의 수량을 입력하세요: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문사셨습니다. 총 가격은 " + totalPrice);
        // 쉬프트 + F6 리네임 : if scanner 변수 이름을 한번에 바꿀 때
    }
}
