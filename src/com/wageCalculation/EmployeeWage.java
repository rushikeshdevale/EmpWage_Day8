package com.wageCalculation;

public class EmployeeWage {
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program !!");
        int workingDay = 20;
        int empHrs = 0;
        int empwage = 0;
        int totalWage = 0;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;
        while (totalWorkingHrs <= MAX_WORKING_HRS && totalWorkingHrs < MAX_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalWorkingHrs += empHrs;
            empwage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println(" Employee Wage = " + empwage);
            totalWage = totalWage + empwage;
            System.out.println("Total working hrs = " + totalWorkingHrs);
            System.out.println("Total Emp wage for 20 days = " + totalWage);
        }

    }
}
