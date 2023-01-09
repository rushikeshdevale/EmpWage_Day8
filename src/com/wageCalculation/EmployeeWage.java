package com.wageCalculation;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program !!");
        int EMP_RATE_PER_HOUR = 20;
        int IS_FULL_TIME = 1;
        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empHrs = 8;
        } else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage " + empwage);
    }
}
