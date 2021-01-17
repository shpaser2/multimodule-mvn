package by.academy.model;

import java.math.BigDecimal;
import java.util.Arrays;

public class Employee {
    private String name;
    private BigDecimal[] monthsSalaries = new BigDecimal[12];

    public Employee(String name) {
        this.name = name;
        Arrays.fill(this.monthsSalaries, BigDecimal.ZERO);
    }

    public Employee(String name, BigDecimal[] monthsSalaries) {
        this.name = name;
        this.monthsSalaries = Arrays.copyOf(monthsSalaries,
                monthsSalaries.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal[] getMonthsSalaries() {
        return monthsSalaries;
    }

    public void setMonthsSalaries(BigDecimal[] monthsSalaries) {
        this.monthsSalaries = monthsSalaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", monthsSalaries=" + Arrays.toString(monthsSalaries) +
                '}';
    }
}
