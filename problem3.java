import java.util.Scanner;

public class problem3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not- ");
        int n = sc.nextInt();

        //Since 0 i neither prime nor composite number
        if(n==0){
            System.out.println("Please enter a valid number (greater than 0) Number");
        }
        //explicitly checking for 1
        if(n==1){
            System.out.println(n+" is a Prime Number");
        }
        else{
            // a prime no. is divisible by only one or itself
            for(int i=2;i<=9;i++){
                if(i!=n && n%i==0){
                    System.out.println(n+" is not a Prime Number");
                    return;
                }
            }
            System.out.println(n+" is a Prime Number");
        }


    }



}
