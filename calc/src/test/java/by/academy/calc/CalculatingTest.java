package by.academy.calc;

import by.academy.model.Employee;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatingTest {

    @Test
    public void calcAverageSalary() {
        //given
        int monthsInYear = 12;
        BigDecimal[] salaries = new BigDecimal[monthsInYear];
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = new BigDecimal(i);
        }
        Employee employee = new Employee("Ivan", salaries);
        // 0 + 1 + 2 + ... + 11 = 66; 66 / 12 = 5.50
        BigDecimal expected = new BigDecimal("5.50");
        //when
        BigDecimal actual = Calculating.calcAverageSalary(employee);
        //then
        assertEquals(expected, actual);
    }
}