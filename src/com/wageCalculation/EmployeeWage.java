package com.wageCalculation;

public class EmployeeWage {
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program !!");
        int workingDay = 20;
        int empHrs = 0;
        int empwage = 0;
        int totalWage = 0;
        for (int i = 1; i <= workingDay; i++) {
            int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empcheck) {
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
            System.out.println("Day " + i + " Employee Wage = " + empwage);
            totalWage = totalWage + empwage;
        }
        System.out.println("Total Emp wage for 20 days = " + totalWage);
    }
}
