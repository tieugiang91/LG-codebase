package srp;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Employee {
    private final String employeeName;
    private final LocalTime start;
    private final LocalTime end;
    // Constructor
    public Employee(String employeeName, LocalTime start, LocalTime end) {
        this.employeeName = employeeName;
        this.start = start;
        this.end = end;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void save() {
        System.out.println("Employee Name: " + employeeName + " Start Time: " + start + " End Time: " + end);
    }
    public int reportHours() {
        HourReporter hourReporter = new HourReporter(start, end);
        return hourReporter.reportHours();
    }
    public double calculatePay() {
        PayCalculator payCalculator = new PayCalculator(start, end);
        return payCalculator.calculatePay();
    }
    public static void main(String[] args) {
        // Example usage:
        LocalTime start = LocalTime.of(9, 0);  // Regular start time at 9 AM
        LocalTime end = LocalTime.of(18, 0);
        Employee emp = new Employee("John Doe", start, end); // Creating an employee with 45 hours worked
        emp.save();
        System.out.println(emp.getEmployeeName() + " works on time for: " + emp.reportHours() + " hours");
        System.out.println(emp.getEmployeeName() + " works totally for: " + start.until(end, ChronoUnit.MINUTES) / 60.0 + " hours");
        System.out.println(emp.getEmployeeName() + " is paid: $" + emp.calculatePay());
    }
}