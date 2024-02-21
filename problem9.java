import java.util.Arrays;
import java.util.Scanner;

public class problem9 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of string you want to add-");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strArr = new String[n];
        for(int i=0;i<n;i++){
            strArr[i]=sc.nextLine();
        }

//        for(int i=0;i< strArr.length;i++){
//            System.out.print(strArr[i]+" ");
//        }
        //apply bubble sort algorithm for sorting the string array based on each string length
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(strArr[j].length()>strArr[j+1].length()){
                    String temp=strArr[j];
                    strArr[j]=strArr[j+1];
                    strArr[j+1]=temp;
                }
            }
        }

        //now apply bubble sort for sorting the strings of same length in alphabetic order
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(strArr[j].length()==strArr[j+1].length() && strArr[i].compareTo(strArr[j+1])>0){
                    String temp=strArr[j];
                    strArr[j]=strArr[j+1];
                    strArr[j+1]=temp;
                }
            }
        }

        //printing the string array
        for(int i=0;i< strArr.length;i++){
            System.out.print(strArr[i]+" ");
        }

    }


}
