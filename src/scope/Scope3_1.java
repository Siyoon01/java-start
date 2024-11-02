package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // temp 의 생존 범위를 비효율적으로 설정. -> 불필요한 메모리 사용, 코드 복잡성 증가
        if (m > 0) {
            temp = m * 2;
            // int temp = m * 2; -> 이 방법이 더 효율적
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
