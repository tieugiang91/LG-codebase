package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Singleton {
    public static void main(String[] args) {
        // Example usage:
        LocalTime start = LocalTime.of(11, 0);  // Regular start time at 9 AM
        LocalTime end = LocalTime.of(18, 0);
        Employee emp = Employee.getInstance();// Creating an employee with 45 hours worked
        emp.save();
        System.out.println(emp.getEmployeeName() + " works on time for: " + emp.reportHours());
        System.out.println(emp.getEmployeeName() + " works totally for: " + start.until(end, ChronoUnit.MINUTES)/60.0);
        System.out.println(emp.getEmployeeName() + "is paid: $" + emp.calculatePay(start, end));
    }
}
