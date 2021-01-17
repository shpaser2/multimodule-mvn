package by.academy.app;

import by.academy.calc.Calculating;
import by.academy.model.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loader {
    private static Scanner input = new Scanner(System.in);

    public static void main( String[] args ) {
        System.out.println("Введите количество служащих:");
        int amount = Loader.input.nextShort();
        List<Employee> employees = Loader.fillInEmployeeSalaries(amount);
        Loader.showAverageSalaries(employees);
    }

    private static void showAverageSalaries(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.print(employee.getName()
                    + " средняя годовая зарплата: ");
            System.out.println(Calculating.calcAverageSalary(employee)
                    .toString());
        }
    }

    private static List<Employee> fillInEmployeeSalaries(int employeeAmount) {
        ArrayList<Employee> employees = new ArrayList<>();
        List<BigDecimal> salaries = new ArrayList<>();
        while (employeeAmount > 0) {
            String name = Loader.getName();

            for (int i = 0; i < Employee.SALARIES_MOUNTHS_PERIOD; i++) {
                System.out.printf("введите зарплату за %d месяц \n", i + 1);
                salaries.add(Loader.input.nextBigDecimal());
            }
            employees.add(new Employee(name, salaries));
            employeeAmount--;
        }
        return employees;
    }

    private static String getName() {
        System.out.println("\n\tВведите имя работника: ");
        String name = "";
        while ("".equals(name)) {
            name = Loader.input.nextLine();
        }
        return name;
    }
}
