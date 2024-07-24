package srp;

import java.time.LocalTime;

public class HourReporter {
    private final EmployeeData employeeData;

    public HourReporter(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public int reportHours() {
        return (int) employeeData.regularHoursForReport();
    }
}
