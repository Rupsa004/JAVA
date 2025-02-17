/*public class PrintName{
    public static void main(String[] args) {
        System.out.println("Rupsa");
    }
}
*/

//using scanner class

import java.util.Scanner ;
public class PrintName{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
            System.out.print("Enter name: ");
            String name=scanner.nextLine();
            System.out.println("Hello I am "+ name);


        scanner.close();
        
    }
}





