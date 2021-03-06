package by.academy.calc;


import by.academy.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculating {
    public static BigDecimal calcAverageSalary(Employee employee) {
        BigDecimal[] salaries = employee.getMonthsSalaries();
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal salary : salaries) {
            sum = sum.add(salary);
        }
        int scale = 2;
        BigDecimal average = sum.divide(BigDecimal.valueOf(salaries.length),
                scale, RoundingMode.HALF_UP);
        return average;
    }
}
