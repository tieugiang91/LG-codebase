package srp;

public class EmployeeSaver {
    private final EmployeeData employeeData;

    public EmployeeSaver(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public void save() {
        System.out.println("Employee Name: " + employeeData.getEmployeeName() + " Start Time: " + employeeData.getStart() + " End Time: " + employeeData.getEnd());
    }
}
