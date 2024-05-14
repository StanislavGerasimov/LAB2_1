public class RungeKutta {
    public static void rungeKuttaMethod(double x0, double y0, double h, double xn) {
        double x = x0;
        double y = y0;

        while (x < xn) {
            System.out.printf("%.2f\t| %.6f\n", x, y);
            double k1 = h * (0.5 * x - Math.pow(y, 2));
            double k2 = h * (0.5 * (x + h) - Math.pow(y + k1, 2));
            y = y + (k1 + k2) / 2;
            x += h;
        }
    }
}
