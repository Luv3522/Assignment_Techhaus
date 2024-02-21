import java.util.Scanner;

public class problem8 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in prescribed format-");
        String time = sc.nextLine();

        String temp="";  //temporary string for each token of the string
        int totalSec=0;
        int k=0; // k==0 for converting hours into seconds && k==1 for converting minutes into seconds
        for(int i=0;i<time.length();i++){

            // making tokens of the string using space(' ') as a delimiter
            if(time.charAt(i)==' '){
                //removing last character of each token i.e "h" or "m" or "s"
                String str = temp.substring(0,temp.length()-1);

                //converting the magnitude valur in string into Integer value
                int value = Integer.parseInt(str);
                if(k==0){
                    totalSec+=value*3600;
                }
                else if(k==1){
                    totalSec+=value*60;
                }
                k++;

                //clear temp for new token
                temp="";
            }
            else{
                //if no space add the character of the string to temp string
                temp+=time.charAt(i);
            }
        }

        //code for handling last token i.e for seconds part like 10s
        String str = temp.substring(0,temp.length()-1);
        int value = Integer.parseInt(str);
        totalSec+=value;

        System.out.println("Total seconds in time "+time+" are- "+totalSec+" seconds");


    }
}
