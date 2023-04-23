import java.util.Arrays;
import java.util.Random;

// 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя.

public class DZ_1_3 {
    public static void main(String[] args) {
        Random rdm = new Random();

        int[] arr1 = new int[rdm.nextInt(1, 10)];
        // System.out.println(arr1.length);
        // int[] arr1 = new int[5];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rdm.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[rdm.nextInt(1, 10)];
        // System.out.println(arr2.length);
        // int[] arr2 = new int[5];
        
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rdm.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(arr2));
        
        // System.out.println(Arrays.toString(NewArrayDiff(arr1, arr2)));
        NewArrayDiff(arr1, arr2);
    }

    public static void NewArrayDiff(int[] arr1, int[] arr2) {
        int[] arrDiff = new int[arr1.length];
        if (arr1.length == arr2.length) {
            
            for (int i = 0; i < arrDiff.length; i++) {
                arrDiff[i] = arr1[i] - arr2[i];
            }
            System.out.println(Arrays.toString(arrDiff));
        }
        
        // return arrDiff;
        if (arr1.length != arr2.length) {
            
            System.out.println("Массивы разной длины! Вычитание элементов невозможно!");
            
        }
        
    }

}
