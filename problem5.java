import java.util.Scanner;

public class problem5 {

    public static void main(String[] args){

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0){
                    evenSum+=arr[i][j];
                }
                else{
                    oddSum+=arr[i][j];
                }
            }
        }

        if(evenSum==oddSum){
            System.out.println("Sum of even elements- "+evenSum);
            System.out.println("Sum of odd elements- "+oddSum);
            System.out.println("Therefore this array is a special array.");
        }
        else{
            System.out.println("This array is nota special array");
        }


    }
}
