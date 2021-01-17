package by.academy.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    public static final int SALARIES_MOUNTHS_PERIOD = 12;
    private List<BigDecimal> monthsSalaries = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
        for (BigDecimal monthsSalary : monthsSalaries) {
            monthsSalary = new BigDecimal('0');
        }
    }

    public Employee(String name, List<BigDecimal> monthsSalaries) {
        this.name = name;
        this.monthsSalaries = List.copyOf(monthsSalaries);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BigDecimal> getMonthsSalaries() {
        return monthsSalaries;
    }

    public void setMonthsSalaries(List<BigDecimal> monthsSalaries) {
        this.monthsSalaries = List.copyOf(monthsSalaries);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", monthsSalaries=" + monthsSalaries +
                '}';
    }
}
