package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR=20;
    static final int FULL_TIME_HOUR=8;
    static final int PART_TIME_HOUR=4;
    public static void main(String[] args) {
        int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
        int dailyWage=0;
        if(employeeAttendance==2){
            System.out.println("Employee is present");
            dailyWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
        }
        else if(employeeAttendance==1){
            System.out.println("Employee is part time");
            dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
        }
        else{
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Wage of employee is => "+dailyWage);
    }
}
