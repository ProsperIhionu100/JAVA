import java.util.Scanner;

public class funny {
    public void doMath(){
        try {
            
            Scanner sc = new  Scanner(System.in);
            int  first, second;
            int result = 0;
            
            System.out.println("Enter first number");
            first = sc.nextInt();
            System.out.println("Enter second  number");
            second = sc.nextInt();
            
            result = first / second;
            System.out.println(first + " multiplied by " + second + "= " + result);
        } catch (ArithmeticException  e) {
            System.out.println("Caught execption");
        }
    }

    public static void main(String[] args) {
        funny fn = new funny();
        fn.doMath();
    }
}
