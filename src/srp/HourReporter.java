package srp;

import java.time.LocalTime;

public class HourReporter extends Employee{
    public HourReporter(String employeeName, LocalTime start, LocalTime end) {
        super(employeeName, start, end);
    }

//    public int reportHours() {
//        return (int) regularHours(start, end);
//    }

}
