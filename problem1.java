import java.util.Scanner;

public class problem1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows");

        //Taking input for no. of rows
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j!=1){
                    System.out.print(" ");
                }
                System.out.print(n);
            }
            System.out.println();
        }
    }


}
