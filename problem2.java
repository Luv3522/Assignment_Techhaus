import java.util.Arrays;
import java.util.Scanner;

public class problem2 {


    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array- ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //sort the array in increasing order
        Arrays.sort(arr);

        //reverse the array for getting it sorted in decreasing order
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            //swap the elements at ith and jth position of the array
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }


}
