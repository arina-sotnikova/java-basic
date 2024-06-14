package ru.otus.java.home.homework9;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListsProcessor {
    public static List<Integer> makeArrayListFromMinAndMaxValues(int min, int max) {
        int initialArrayListCapacity = (max - min) + 1;
        List<Integer> nums = new ArrayList<>(initialArrayListCapacity);
        for (int i = min; i <= max; i++) {
            nums.add(i);
        }
        return nums;
    }


    public static int sumElemsGreaterThan5(ArrayList<Integer> arrList) {
        int sum = 0;
        for (Integer i : arrList) {
            if (i > 5) sum += i;
            sum += 0;
        }
        return sum;
    }


    public static ArrayList<Integer> replaceValuesOfList(int num, ArrayList<Integer> arrList) {
        ListIterator<Integer> iterator = arrList.listIterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.set(num);
        }
        return arrList;
    }


    public static ArrayList<Integer> increaseValues(int num, ArrayList<Integer> arrList) {
        ListIterator<Integer> iterator = arrList.listIterator();
        while(iterator.hasNext()) {
            int item = (Integer) iterator.next();
            iterator.set(item += num);
        }
        return arrList;
    }
}
