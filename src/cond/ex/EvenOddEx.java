package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 100;
        String num = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + num);
    }
}
