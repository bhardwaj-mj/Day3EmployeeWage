package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int employeeAttendance=(int)Math.floor(Math.random()*10)%2;
        if(employeeAttendance==1){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
    }
}
