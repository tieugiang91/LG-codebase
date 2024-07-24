package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class EmployeeSaver {

    private final String employeeName;
    private final LocalTime start;
    private final LocalTime end;

    public EmployeeSaver(String employeeName, LocalTime start, LocalTime end) {
        this.employeeName = employeeName;
        this.start = start;
        this.end = end;
    }
    public void save() {
        System.out.println("Employee Name: " + employeeName + " Start Time: " + start + " End Time: " + end);
    }
}