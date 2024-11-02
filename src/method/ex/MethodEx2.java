package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "hello, world!";

        printMessage(message, 5);

        printMessage(message, 7);

        printMessage(message, 9);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
