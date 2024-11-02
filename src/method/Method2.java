package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 실행합니다. =" );
        return; // void 의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
    }
}
