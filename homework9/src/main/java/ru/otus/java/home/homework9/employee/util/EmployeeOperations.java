package ru.otus.java.home.homework9.employee.util;

import ru.otus.java.home.homework9.employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeOperations {
    public static List<String> getAllNames(List<Employee> employees) {
        List<String> employeesNames = new ArrayList<>();
        for (Employee e: employees) {
            employeesNames.add(e.getName());
        }
        return employeesNames;
    }

    public static List<Employee> getEmployeesOfSpecificAge(int age, List<Employee> employees) {
        List<Employee> employeesOFSpecificAge = new ArrayList<>();
        for (Employee e: employees) {
            if (e.getAge() >= age) {
                employeesOFSpecificAge.add(e);
            }
        }
        return employeesOFSpecificAge;
    }

    public static boolean checkAverageAge(int minAverageAge, List<Employee> employees) {
        int sum = 0;
        int averageAge = 0;
        for (Employee e: employees) {
            sum += e.getAge();
        }
        averageAge = sum / employees.size();
        return averageAge > minAverageAge;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        return Collections.min(employees, Comparator.comparing(Employee::getAge));
    }
}
