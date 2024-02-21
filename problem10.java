import java.util.Scanner;

public class problem10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array -");
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            maxNum=Integer.max(maxNum,arr[i]);
            minNum=Integer.min(minNum,arr[i]);

        }
        int sum=maxNum+minNum;
        System.out.println("The sum of smallest and largest numbers is - "+sum);

    }


}
