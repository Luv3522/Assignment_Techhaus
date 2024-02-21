import java.util.Scanner;

public class problem7 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number -");
        int num1=sc.nextInt();

        System.out.println("Enter Second number -");
        int num2=sc.nextInt();

        //for addition
        if((num1>0 && num2>Integer.MAX_VALUE-num1) || (num1<0 && num2<Integer.MIN_VALUE-num1)){
            System.out.println("Adding "+num1+" & "+num2+" will result in Integer overflow");
        }
        else{
            System.out.println("Adding "+num1+" & "+num2+" will not result in Integer overflow");
        }

        //for multiplication
        if (num1 > 0 && num2 > Integer.MAX_VALUE / num1) {
            System.out.println("Multiplication of "+num1+" & "+num2+" will result in Integer overflow");
        } else if (num1 < 0 && num2 < Integer.MAX_VALUE / num1) {
            System.out.println("Multiplication of "+num1+" & "+num2+" will result in Integer overflow");
        } else {
            System.out.println("Multiplication of "+num1+" & "+num2+" will not result in Integer overflow");
        }


    }


}
