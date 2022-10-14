package com.bridgelabz;

public class EmployeeWage {
    static final int FULL_TIME_HOUR=8;
    static final int PART_TIME_HOUR=4;
    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    public static void empWage(int wagePerHour,int workingDaysPerMonth,int workingHoursPerMonth){
        int day=1;
        int totalWages=0;
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

    public static void main(String[] args) {
        EmployeeWage amazon=new EmployeeWage();
        System.out.println("Employee wage for Amazon => ");
        amazon.empWage(20,20,80);
        System.out.println("Employee wage for Flipkart => ");
        amazon.empWage(15,25,100);
        System.out.println("Employee wage for Google => ");
        amazon.empWage(30,18,75);
    }
}
