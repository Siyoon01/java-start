package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        int sum = sum(1, 2, 3);
        double average = average(sum);
        System.out.println("합: " + sum + ", 평균: " + average);

        sum = sum(10, 15, 20);
        average = average(sum);
        System.out.println("합: " + sum + ", 평균: " + average);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(double sum) {
        return sum / 3.0;
    }
}
