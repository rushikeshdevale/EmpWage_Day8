package com.wageCalculation;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program !!");
        int EMP_RATE_PER_HOUR = 20;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empcheck) {
            case 2:
                System.out.println("Employee is Part time ");
                empHrs = 4;
                break;
            case 1:
                System.out.println("Employee is Full time ");
                empHrs = 8;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage = " + empwage);
    }
}
