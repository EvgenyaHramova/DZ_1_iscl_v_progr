import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


public class DZ_1_1 {

    public static void main(String[] args) {
        method_1();
        method_2();
        method_3();

    }

    public static void method_1() {
        File file = new File("Exception1");
        try {
            Scanner sc = new Scanner(file);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

    public static void method_2() {
        System.out.println("Введите числа, отличные от нуля: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Был введен ноль!");
                }
            }
            scanner.close();
        }

    }

    public static void method_3() {
        int x = 0;
        int y = 0;
        double z = 0;
        Random numRandom = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                x = numRandom.nextInt(1, 100);
                System.out.println(x);
                y = numRandom.nextInt(1, 100);
                System.out.println(y);
                z = 100 / (x / (double) y);
            } catch (ArithmeticException e) {
                System.out.println("x деленное на y равно ноль! А на ноль нельзя делить!");
                z = 0;
            }
            System.out.println("Значение z равно: " + z);
        }
    }

}
