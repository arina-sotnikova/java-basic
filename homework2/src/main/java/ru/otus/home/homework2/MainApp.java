package ru.otus.home.homework2;

import java.util.Arrays;
import java.util.Comparator;

public class MainApp {
    // 1 task
    public static void printNTimes(int n, String a) {
        for (int i = 0; i < n; i++) {
            System.out.println(a);
        }
    }

    // 2 task
    public static void printArrayElemSumGreaterThan5(int[] in) {
        int sumElemsGreaterThan5 = Arrays.stream(in).filter(num -> num > 5).sum();
        System.out.println(sumElemsGreaterThan5);
    }

    // 3 task
    public static int[] fillArray(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }
        return arr;
    }

    // 4 task
    public static int[] addNumToArrElem(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += num;
        }
        return arr;
    }

    // 5 task
    public static void printGreaterSumOfElems(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int middleElemIndex = (arr.length / 2) - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i <= middleElemIndex) sum1 += arr[i];
            else sum2 += arr[i];
        }
        if (sum1 > sum2)
            System.out.println("Сумма элементов первой половины массива больше");
        else if (sum2 > sum1)
            System.out.println("Сумма элементов второй половины массива больше");
        else
            System.out.println("Суммы элементов половин массива равны");
    }

    // *1 task
    public static void sumArraysElementWise(int[]... arrays) {
        int[][] sortedByLength = Arrays.stream(arrays).sorted(Comparator.comparingInt(x -> x.length)).toArray(int[][]::new);
        int numArrays = sortedByLength.length;
        for (int j = 0; j < numArrays - 1; j++) {
            for (int i = 0; i < sortedByLength[j].length; i++) {
                sortedByLength[j + 1][i] += sortedByLength[j][i];
            }
        }
        System.out.println(Arrays.toString(sortedByLength[numArrays - 1]));
    }

    // *2 task
    public static void findPointOfEquality(int[] array) {
        if (array.length < 2)
            System.out.println("Точки равенства сумм элементов массива не существует");
        else {
            int sum1 = array[0];
            int sum2 = Arrays.stream(array).skip(1L).sum();
            for (int i = 1; i < array.length; i++) {
                if (sum1 > sum2) {
                    System.out.println("Точки равенства сумм элементов массива не существует");
                    break;
                } else if (sum1 == sum2) {
                    System.out.println("Точка равенства сумм элементов массива существует");
                    break;
                }
                // случай, когда левая сумма меньше правой
                else {
                    sum1 += array[i];
                    sum2 -= array[i];
                }
            }
        }
    }

    // *3 task
    public static boolean checkOrdering(int[] array, Comparator<Integer> comp) {
        if (array.length < 2) {
            return true;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (comp.compare(array[i], array[i + 1]) <= 0) ;
                else return false;
            }
            return true;
        }
    }

    // *4 task
    public static int[] reverseArray(int[] array) {
        if (array.length < 2) {
            return array;
        }
        else {
            int midElementIndex = array.length / 2 - 1;
            int lastElementIndex = array.length - 1;
            for (int i = 0; i <= midElementIndex; i++) {
                int leftElementToSwap = array[i];
                int rightElementToSwap = array[lastElementIndex - i];
                array[i] = rightElementToSwap;
                array[lastElementIndex - i] = leftElementToSwap;
            }
            return array;
        }
    }
}
