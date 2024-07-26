package srp;

import java.io.PrintStream;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Employee {
    private final String employeeName;
    private final LocalTime start;
    private final LocalTime end;

    public Employee(String employeeName, LocalTime start, LocalTime end) {
        this.employeeName = employeeName;
        this.start = start;
        this.end = end;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void save() {
        System.out.println("Employee Name: " + this.employeeName + " Start Time: " + this.start + " End Time: " + this.end);
    }

    public static void main(String[] args) {
        LocalTime start = LocalTime.of(11, 0);
        LocalTime end = LocalTime.of(18, 0);
        Employee emp = new Employee("John Doe", start, end);
        emp.save();
        HourReporter hourReporter = new HourReporter(start, end);
        PayCalculator payCalculator = new PayCalculator(start, end);
        PrintStream var10000 = System.out;
        String var10001 = emp.getEmployeeName();
        var10000.println(var10001 + " works on time for: " + hourReporter.reportHours());
        var10000 = System.out;
        var10001 = emp.getEmployeeName();
        var10000.println(var10001 + " works totally for: " + (double)start.until(end, ChronoUnit.MINUTES) / 60.0);
        var10000 = System.out;
        var10001 = emp.getEmployeeName();
        var10000.println(var10001 + "is paid: $" + payCalculator.calculatePay(start, end));
    }
}