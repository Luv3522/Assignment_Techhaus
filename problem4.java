import java.util.Scanner;

public class problem4 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String- ");
        String str = sc.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                lower++;
            }
            else if(ch!=' '){
                upper++;
            }
        }

        System.out.println("No. of Uppercase letter in "+str+" is- "+upper);
        System.out.println("No. of Lowercase letter in "+str+" is- "+lower);

        if(lower==upper){
            System.out.println(str+" has equal no. of uppercase and lowercase letters");
        }
    }



}
