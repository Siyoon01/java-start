package loop;

public class While2_3 {

    public static void main(String[] args) {
        int i = 10;
        int endNum = 15;
        int sum = 0;
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("sum = " + sum + ", i = " + i);
            i += 1;
        }
    }
}
