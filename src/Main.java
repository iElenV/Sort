import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int number  = scanner.nextInt();

        int [] arr = CreateArr(number);
        get_Sort_Arr(arr);
        System.out.println("Содержимое массива после сортировки:");
        PrintArr(arr);

    }

    public static int [] CreateArr(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа в массив последовательно:");
        int [] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr; }

    public static void PrintArr (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


    private static int [] get_Sort_Arr (int[] arr) {
        boolean NIt = true;
        while (NIt) {
            NIt = false;
            for (int k = 1; k<arr.length; k++) {
                if (arr[k] < arr[k-1]) {
                    change(arr, k, k-1);
                    NIt = true;
                }

            }

        }
        return arr;}

    private static void change(int[] arr, int index1, int index2) {
        int temp = arr [index1];
        arr [index1] = arr [index2];
        arr [index2] = temp;

    }
}