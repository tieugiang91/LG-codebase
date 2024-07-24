package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PayCalculator {
    private final EmployeeData employeeData;

    public PayCalculator(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public double calculatePay(LocalTime start, LocalTime end)
    {
        return 15.0 * employeeData.regularHoursForPay(start, end) + 17 * (start.until(end, ChronoUnit.MINUTES)/60.0 - employeeData.regularHoursForPay(start, end));
    }
}
