package Day4;

import java.util.Scanner;

public class InstancePayCheck {
   static double requiredSalary = 2000;
   static double requiredCreditCard = 500;
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        // what we have





        // what we need
        double salary = getEmployeeSalary();
        double score = getEmployeeScore();
        boolean qualified = isQualified(salary,score);
        notifiedUser(qualified);

        // logic
        scanner.close();
    }
    static void notifiedUser(boolean qualified){
    if(qualified){
        System.out.println("you are Qualified");
    }else {
        System.out.println("you are not Qualified");
    }
    }
    static double getEmployeeScore(){

        System.out.println("Enter Your Score");

        return scanner.nextDouble();
    }

   static double getEmployeeSalary(){

       System.out.println("Enter Your Salary");

       return scanner.nextDouble();



    }
    static boolean isQualified(double salary,double score){
        return salary >= requiredSalary && score >= requiredCreditCard;

    }

}
