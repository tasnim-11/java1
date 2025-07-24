public class FactorialSeries {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }
    }
}
