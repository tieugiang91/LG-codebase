package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EmployeeData {
    private final String employeeName;
    private final LocalTime start;
    private final LocalTime end;

    public EmployeeData(String employeeName, LocalTime start, LocalTime end) {
        this.employeeName = employeeName;
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double regularHoursForPay(LocalTime startTime, LocalTime endTime) {
        // Define regular working hours
        LocalTime regularStartTime = LocalTime.of(9, 0);  // Regular start time at 9 AM
        LocalTime regularEndTime = LocalTime.of(17, 0);   // Regular end time at 5 PM

        // Calculate total hours worked within regular working hours
        long totalHoursWorked = 0;
        if (endTime.isAfter(regularStartTime) && startTime.isBefore(regularEndTime)) {
            LocalTime startTmp = startTime;
            LocalTime endTMp = endTime;

            totalHoursWorked = startTmp.until(endTMp, ChronoUnit.MINUTES);
        }

        return totalHoursWorked / 60.0;  // Return total non-overtime hours worked
    }

    public double regularHoursForReport() {
        // Define regular working hours
        LocalTime regularStartTime = LocalTime.of(9, 0);  // Regular start time at 9 AM
        LocalTime regularEndTime = LocalTime.of(17, 0);   // Regular end time at 5 PM

        // Calculate total hours worked within regular working hours
        long totalHoursWorked = 0;
        if (end.isAfter(regularStartTime) && start.isBefore(regularEndTime)) {
            LocalTime startTmp = regularStartTime;
            LocalTime endTMp = regularEndTime;

            totalHoursWorked = startTmp.until(endTMp, ChronoUnit.MINUTES);
        }

        return totalHoursWorked / 60.0;  // Return total non-overtime hours worked
    }
}
