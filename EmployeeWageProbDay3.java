package java_program1;

public class EmployeeWageProbDay3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Full_Time =1;
        int emp_rate_per_hour=20;
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random() * 10)%2 ;
        if(empCheck == Full_Time) {
            empHrs=8;
           // System.out.println("Employee is Present");
        }
        else{
              empHrs=0;
              empWage = empHrs * emp_rate_per_hour;
              // System.out.println("Employee is Absent");
            System.out.println("Emp Wage: " +empWage);
        }

    }
    }