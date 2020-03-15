package HW;

import java.util.Arrays;
import java.util.Scanner;

public class HWArrays {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        // Задача 1: Найти наибольший общий делитель (НОД) двух чисел
        int a = 60, b = 45;
        int gCF = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gCF = i;
            }
        }
        System.out.println("НОД чисел " + a + " и " + b + " является: " + gCF);


        System.out.println("Задача 2");
        //Задача 2:Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
        // Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7. Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
        int[] arr1 = {12, 8, 2, -4, 0, 10, 6, 7, 3, 1, -3};
        int m, n;
        int sum = 7;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 10; j > i; j--) {
                if (arr1[i] + arr1[j] == sum) {
                    n = arr1[i];
                    m = arr1[j];
                    System.out.println(n + " и " + m);
                }
            }
        }


        System.out.println("Задача 3");
        //Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
        int[] arr2 = new int[10];
        int min_v;
        int max_v;
        int middle_v;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        min_v = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (i + 1 == arr2.length) {
                max_v = arr2[i];
                middle_v = (arr2[i] + arr2[0]) / 2;
                System.out.println("min_v = " + min_v + ", middle_v = " + middle_v + ", max_v = " + max_v);
            }
        }


        System.out.println("Задача 4");
        //Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        // Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        // Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        // Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его в консоль
        System.out.println("Введие любое натуральное число");
        Scanner in = new Scanner(System.in);
        int Val = in.nextInt();
        if (Val > 3) {
            int[] arbArr = new int[Val + 1];
            for (int i = 0; i < arbArr.length; i++) {
                arbArr[i] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(arbArr));
            int[] arbArr1 = new int[Val + 1];
            for (int i = 0; i < arbArr.length; i++) {
                if (arbArr[i] % 2 == 0) {
                    arbArr1[i] = arbArr[i];
                }
            }
            Arrays.sort(arbArr1);
            System.out.println(Arrays.toString(arbArr1));
            for (int i = arbArr1.length - 1; i >= 0; i--) {
                if (arbArr1[i] == 0) {
                    arbArr1[i] = arbArr1[i + 1];
                }
            }
            System.out.println(Arrays.toString(arbArr1));
        } else {
            System.out.println("Запустите програвмму заново и введите натуральное число больше 3-х");
        }


        System.out.println("Задача 5");
        //Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        // Вывести массив в консоль. После на отдельной строке вывести в консоль значение максимального элемента этого массива.
        int[][] multArr = new int[5][8];
        for (int i = 0; i < multArr.length; i++) {
            for (int j = 0; j < multArr[i].length; j++) {
                if (j % 2 == 0) {
                    multArr[i][j] = (int) (Math.random() * 100);
                } else {
                    multArr[i][j] = (int) (Math.random() * -100);
                }
            }
        }
        System.out.println("Генерация массива:");
        System.out.println(Arrays.deepToString(multArr));
        for (int i = 0; i < multArr.length; i++) {
            for (int j = 0; j < multArr[i].length; j++) {
                Arrays.sort(multArr[i]);
            }
        }
        System.out.println("Сортировка массива:");
        System.out.println(Arrays.deepToString(multArr));
        int max = multArr[0][7];
        for (int i = 1; i < multArr.length; i++) {
            int j = 7;
            if(multArr[i][j] > max){
                max = multArr[i][j];
            }
        }
        System.out.println("Максимальное число в данном массиве - это " + max);

    }
}