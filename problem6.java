import java.util.Scanner;

public class problem6 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount- ");
        double principleAmt = sc.nextDouble();

        System.out.println("Enter the yearly rate of interest- ");
        double yearlyInterestRate = sc.nextDouble();

        System.out.println("Enter number of months- ");
        int noOfMonths = sc.nextInt();


        //converting yearly interest rate into monthly interest rate
        double monthlyInterest = yearlyInterestRate/12/100;

        double totalInterest=0;

        for(int i=0;i<noOfMonths;i++){
            //calculating total interest by compounding principle amount
            totalInterest+=principleAmt*monthlyInterest;
            principleAmt+=principleAmt*monthlyInterest;
        }

        System.out.println("Total interest earned on principle amount "+ principleAmt+"in "+noOfMonths+" is- "+totalInterest);

    }


}
