package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HourReporter {
    private final LocalTime start;
    private final LocalTime end;

    public HourReporter(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public int reportHours() {
        return (int)this.regularHours(this.start, this.end);
    }

    private double regularHours(LocalTime startTime, LocalTime endTime) {
        LocalTime regularStartTime = LocalTime.of(9, 0);
        LocalTime regularEndTime = LocalTime.of(17, 0);
        long totalHoursWorked = 0L;
        if (endTime.isAfter(regularStartTime) && startTime.isBefore(regularEndTime)) {
            LocalTime start = startTime.isBefore(regularStartTime) ? regularStartTime : startTime;
            LocalTime end = endTime.isAfter(regularEndTime) ? regularEndTime : endTime;
            totalHoursWorked = start.until(end, ChronoUnit.MINUTES);
        }

        return (double)totalHoursWorked / 60.0;
    }
}