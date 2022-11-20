public class Main {

    private String name;
    private static double y;
    private static double S = 0;
    private static double step;
    private static double a;
    private static double b;
    public static void main(String[] args) {
        a = 0;
        b = 2;
        step = 0.000001;
        for (double x = a; x <= b; x = x + step) {
            y = f(x);
            S = S + y * step;
        }
        System.out.println(S);
    }
    private static double f(double x) {
        return x * x;
    }
}