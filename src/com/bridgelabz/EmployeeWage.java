package com.bridgelabz;

public class EmployeeWage {
    static final int FULL_TIME_HOUR=8;
    static final int PART_TIME_HOUR=4;
    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    private String companyName;
    private int wagePerHour;
    private int workingDaysPerMonth;
    private int workingHoursPerMonth;
    private int totalWages=0;

    public EmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHourPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHourPerMonth;
    }

    public void empWage(){
        int day=1;

        int empHours=0;
        while(day<=workingDaysPerMonth && empHours<=workingHoursPerMonth) {
            int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = 0;
            switch (employeeAttendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    dailyWage = wagePerHour * FULL_TIME_HOUR;
                    empHours=empHours+FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    dailyWage = wagePerHour * PART_TIME_HOUR;
                    empHours=empHours+PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            totalWages += dailyWage;
            System.out.println("Daily Wage of employee for day "+day+" is => " + dailyWage);
            day++;
        }
        System.out.println("Total working hours of employee is => "+empHours);
        System.out.println("Tatal Wages of employee is => "+totalWages);
    }

    @Override
    public String toString() {
        return "Total wage for company " +companyName+ " is:"+totalWages;
    }

    public static void main(String[] args) {
    EmployeeWage google=new EmployeeWage("Google",20,15,80);
    EmployeeWage amazon=new EmployeeWage("Amazon",30,20,80);
        google.empWage();
        System.out.println(google);
        amazon.empWage();
        System.out.println(amazon);
    }
}
