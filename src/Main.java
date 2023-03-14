import java.util.Scanner;

/*
Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину сторон прямоугольника (два целых числа через пробел)");
        int rectangleA = scanner.nextInt();
        int rectangleB = scanner.nextInt();
        System.out.println("Введите длину радиуса окружности");
        int circleR = scanner.nextInt();
        scanner.close();
        boolean result = getGeom(rectangleA, rectangleB, circleR);
        if (result) System.out.printf("Окружностью радиусом %d можно полностью закрыть прямоугольник со сторонами " +
                "%d и %d", circleR, rectangleA, rectangleB);
        else System.out.printf("Окружностью радиусом %d нельзя полностью закрыть прямоугольник со сторонами " +
                "%d и %d", circleR, rectangleA, rectangleB);
    }

    static boolean getGeom(int a, int b, int r) {
        double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // рассчет диагонали прямоугольника
        return r >= d;
    }
}