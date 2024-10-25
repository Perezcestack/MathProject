package Week5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Employee {
    static Scanner input = new Scanner(System.in);
        public int getEmpID() {
            return empID;
        }

        public void setEmpID(int empID) {
            this.empID = empID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getPayRate() {
            return payRate;
        }

        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public Employee(int i, String name, String department, double payRate, int hoursWorked) {
            this.empID = empID;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;

        }

        private int empID;
        private String name;
        private String department;
        private double payRate;
        private int hoursWorked;
        private double latestPunchIn;
        private boolean currentlyWorking;

    public double getLatestPunchIn() {
        return latestPunchIn;
    }

    public void setLatestPunchIn(double latestPunchIn) {
        this.latestPunchIn = latestPunchIn;
    }

    public boolean isCurrentlyWorking() {
        return currentlyWorking;
    }

    public void setCurrentlyWorking(boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }

    public Employee(double latestPunchIn, boolean currentlyWorking) {
        this.latestPunchIn = latestPunchIn;
        this.currentlyWorking = currentlyWorking;
    }


        public double getRegularHours(){
            if(hoursWorked <= 40) {
                return hoursWorked;
            }else {
                return 40;
            }
        }
        public double getTotalPay(){
            return hoursWorked * payRate;
        }

        public double getOvertimeHours() {
            if(hoursWorked <= 40) {
                return 0;
            }else { return  hoursWorked - 40;
            }
        }
    public void punchIn(double startTime) {
        this.latestPunchIn = startTime;
        this.currentlyWorking = true;

    }
    public void punchIn(LocalDateTime startTime) {
        this.latestPunchIn = Double.parseDouble(String.valueOf(LocalDateTime.now()));
        this.currentlyWorking = true;
    }

    public double punchOut(double endTime) {
        if (!this.currentlyWorking) {
            return 0;
        } else {

//            double hoursLatestShift = endTime - this.latestPunchIn;
//            // variable initialized equals end time initialized above - latest punch in
//            this.hoursWorked += (int) hoursLatestShift;
//            // hours worked is added the amount of hours from above
//            this.currentlyWorking = false;
//            //setting working to false
//            return hoursLatestShift;
            //return number
        }
        return endTime;
    }
    public double punchOut(LocalDateTime endTime) {
        if (!this.currentlyWorking) {
            return 0;
        }else {

        }
        return 0;
    }

        public double punchTimeCard() {
            System.out.println("What is your hours worked? Please write as " +
                    "\n10:00 am => 10.0\n" +
                    "12:30 pm => 12.5\n" +
                    "2:45 pm => 14.75 ");
            double clockIn = input.nextDouble();

            System.out.println("Please enter your time clocked out in the same format!");
            double clockOut = input.nextDouble();

            return clockOut - clockIn;



        }

}



