package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR=20;
    static final int FULL_TIME_HOUR=12;
    static final int PART_TIME_HOUR=6;
    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    static final int WORKING_DAYS_PER_MONTH=20;
    static final int WORKING_HOURS_PER_MONTH=100;

    public static void main(String[] args) {
        int day=1;
        int totalWages=0;
        int empHours=0;
        while(day<=WORKING_DAYS_PER_MONTH && empHours<=WORKING_HOURS_PER_MONTH) {
            int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
            int dailyWage = 0;
            switch (employeeAttendance) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empHours=empHours+FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    empHours=empHours+PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            totalWages += dailyWage;
            System.out.println("Daily Wage of employee for "+day+" is => " + dailyWage);
            day++;
        }
        System.out.println("Total working hours of employee is => "+empHours);
        System.out.println("Tatal Wages of employee is => "+totalWages);
    }
}
