package srp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class PayCalculator {

    
    private final HourReporter hourReporter;
    

    public PayCalculator(HourReporter hourReporter) {
        this.hourReporter = hourReporter;
    }

    // Method to calculate pay based on regular hours and don't pay for overtime
    public double calculatePay(LocalTime start, LocalTime end)
    {
        return 15.0 * hourReporter.regularHours(start, end) + 17 * (start.until(end, ChronoUnit.MINUTES)/60.0 - hourReporter.regularHours(start, end));
    }
}