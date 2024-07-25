package srp;

import java.time.LocalTime;

public class EmployeeSaver extends Employee{
    public EmployeeSaver(String employeeName, LocalTime start, LocalTime end) {
        super(employeeName, start, end);
    }

    public void save() {
        System.out.println("Employee Name: " + getEmployeeName() + " Start Time: " +getStart()  + " End Time: " + getEnd());
    }
}
