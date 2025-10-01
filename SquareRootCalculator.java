import java.util.Random;

public class SquareRootCalculator {
    public int Sqrt(int x) {
        if (x == 0) return 0;
        for (int i = 1; i <= x; i++) { // Перебор от 1 до x
            long square = (long) i * i;
            if (square == x) {
                return i; // Нашли точный квадратный корень
            }
            if (square > x) {
                return i - 1; // Предыдущее число - правильный ответ
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        SquareRootCalculator calculator = new SquareRootCalculator();
        Random random = new Random();
        // Генерируем массив из 10 случайных чисел от 0 до 1000
        int[] testCases = new int[10];
        System.out.println("Сгенерированные тестовые числа:");
        for (int i = 0; i < testCases.length; i++) {
            testCases[i] = random.nextInt(101); // числа от 0 до 1000
            System.out.print(testCases[i] + " ");
        }
        System.out.println("\nРезультаты вычисления квадратного корня с округлением в меньшую сторону до ближайшего целого числа:");
        for (int num : testCases) {
            int result = calculator.Sqrt(num);
            System.out.printf("√%d = %d%n", num, result);
        }
    }
}