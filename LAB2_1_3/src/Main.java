import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввід початкових умов
        System.out.print("Введіть початкове значення x0: ");
        double x0 = scanner.nextDouble();
        System.out.print("Введіть початкове значення y0: ");
        double y0 = scanner.nextDouble();
        System.out.print("Введіть крок h: ");
        double h = scanner.nextDouble();
        System.out.print("Введіть кінцеве значення x: ");
        double xn = scanner.nextDouble();

        // Виведення заголовка таблиці
        System.out.println(" x\t| y");
        System.out.println("----------------");

        // Виклик методу Рунге-Кутта і виведення результатів
        RungeKutta.rungeKuttaMethod(x0, y0, h, xn);
    }
}