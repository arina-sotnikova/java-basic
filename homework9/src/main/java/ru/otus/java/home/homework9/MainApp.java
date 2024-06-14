package ru.otus.java.home.homework9;

import ru.otus.java.home.homework9.employee.Employee;
import ru.otus.java.home.homework9.employee.util.EmployeeOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {
        // 1
        List<Integer> arrList1 = ListsProcessor.makeArrayListFromMinAndMaxValues(1, 10);
        System.out.println(arrList1);

        // 2
        List<Integer> arrList2 = new ArrayList<>();
        arrList2.add(1);
        arrList2.add(7);
        arrList2.add(13);
        arrList2.add(-1);
        int sumOfElems = ListsProcessor.sumElemsGreaterThan5((ArrayList<Integer>) arrList2);
        System.out.println(sumOfElems);

        // 3
        ArrayList<Integer> arrList3 = new ArrayList<>();
        arrList3.add(1);
        arrList3.add(13);
        arrList3.add(666);
        ListsProcessor.replaceValuesOfList(3, arrList3);
        System.out.println(arrList3);

        // 4
        ArrayList<Integer> arrList4 = new ArrayList<>();
        arrList4.add(-10);
        arrList4.add(20);
        arrList4.add(101);
        ListsProcessor.increaseValues(7, arrList4);
        System.out.println(arrList4);

        // 5
        Employee employee1 = new Employee("Ted", 33);
        Employee employee2 = new Employee("Christine", 49);
        Employee employee3 = new Employee("Jess", 25);
        Employee employee4 = new Employee("Jillian", 27);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);
        List<String> names = EmployeeOperations.getAllNames(employees);
        System.out.println(names);

        // 6
        List<Employee> employeesOfSpecificAge = EmployeeOperations.getEmployeesOfSpecificAge(30, employees);
        System.out.println(employeesOfSpecificAge);

        // 7
        boolean ageCheck = EmployeeOperations.checkAverageAge(30, employees);
        System.out.println(ageCheck);

        // 8
        Employee youngestEmployee = EmployeeOperations.getYoungestEmployee(employees);
        System.out.println(youngestEmployee);
    }
}
