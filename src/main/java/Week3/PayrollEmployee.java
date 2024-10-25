package Week3;

public class PayrollEmployee {
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String emplyeeID) {
        this.employeeID = emplyeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    private String employeeID = "";
    private String name = "";
    private double hoursWorked = 0;
    private double payRate = 0;

    public double getGrossPay() {
        return hoursWorked * payRate;
    }

    public PayrollEmployee(String employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
}
