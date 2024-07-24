package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class HourReporter {

    private LocalTime startTime;
    private LocalTime endTime;

    public HourReporter(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    // Method to report hours with overtime
    public int reportHours() {
        return (int) regularHours(startTime, endTime);
    }

    // Method to calculate regular hours (minimum of 40 and hoursWork)
    public double regularHours(LocalTime startTime, LocalTime endTime) {
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

}