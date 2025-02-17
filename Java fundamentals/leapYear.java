import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter year: ");
        int year= scanner.nextInt();

        scanner.close();

        if(isleapYear(year)){
            System.out.println(year+" is leap year");
        }
        else{
            System.out.println(year+" is not leap year"); 
        }
    }
    public static boolean isleapYear(int year){
        return(year%4==0 && year%100!=0)||(year%400==0);
    }    
}
