public class arithmetic {
   public static void main(String[] args) {
       if(args.length==3){
        double num1= Double.parseDouble(args[0]);
        double num2= Double.parseDouble(args[2]);
        char operator= args[1].charAt(0);
       
        switch(operator){
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '%':
                System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                break;
            default:
                System.err.println("error");
            }
       }
   } 
}
