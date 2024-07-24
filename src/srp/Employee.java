package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Employee {
    private final EmployeeSaver employeeSaver;
    private final PayCalculator payCalculator;
    private final HourReporter hourReporter;
    private final LocalTime start;
    private final LocalTime end;
    private String employeeName;

    // Constructor
    public Employee(String employeeName, LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
        hourReporter = new HourReporter(start, end);
        payCalculator = new PayCalculator(hourReporter);
        employeeSaver = new EmployeeSaver(employeeName, start, end);
        this.employeeName = employeeName;
    }

    // Method to calculate pay based on regular hours and don't pay for overtime
    public double calculatePay(LocalTime start, LocalTime end)
    {
        return payCalculator.calculatePay(start, end);
    }

    // Getter method for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Method to report hours with overtime
    public int reportHours() {
        return hourReporter.reportHours();
    }

    public void save() {
        employeeSaver.save();
    }

    public static void main(String[] args) {
        // Example usage:
        LocalTime start = LocalTime.of(11, 0);  // Regular start time at 9 AM
        LocalTime end = LocalTime.of(18, 0);
        Employee emp = new Employee("John Doe", start , end); // Creating an employee with 45 hours worked
        emp.save();
        System.out.println(emp.getEmployeeName() + " works on time for: " + emp.reportHours());
        System.out.println(emp.getEmployeeName() + " works totally for: " + start.until(end, ChronoUnit.MINUTES)/60.0);
        System.out.println(emp.getEmployeeName() + "is paid: $" + emp.calculatePay(start, end));
    }

}
