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

    // Method to calculate pay based on regular hours and don't pay for overtime
    public double calculatePay(LocalTime start, LocalTime end)
    {
        return 15.0 * regularHours(start, end) + 17 * (start.until(end, ChronoUnit.MINUTES)/60.0 - regularHours(start, end));
    }

    // Getter method for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public LocalTime getEnd() {
        return end;
    }

    public LocalTime getStart() {
        return start;
    }

    // Method to report hours with overtime
    public int reportHours() {
        return (int) regularHours(start, end);
    }

    public void save() {
        System.out.println("Employee Name: " + employeeName + " Start Time: " + start + " End Time: " + end);
    }

    // Method to calculate regular hours (minimum of 40 and hoursWork)
    private double regularHours(LocalTime startTime, LocalTime endTime) {
        // Define regular working hours
        LocalTime regularStartTime = LocalTime.of(9, 0);  // Regular start time at 9 AM
        LocalTime regularEndTime = LocalTime.of(17, 0);   // Regular end time at 5 PM

        // Calculate total hours worked within regular working hours
        long totalHoursWorked = 0;
        if (endTime.isAfter(regularStartTime) && startTime.isBefore(regularEndTime)) {
            LocalTime start = startTime.isBefore(regularStartTime) ? regularStartTime : startTime;
            LocalTime end = endTime.isAfter(regularEndTime) ? regularEndTime : endTime;

            totalHoursWorked = start.until(end, ChronoUnit.MINUTES);
        }

        return totalHoursWorked / 60.0;  // Return total non-overtime hours worked
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
