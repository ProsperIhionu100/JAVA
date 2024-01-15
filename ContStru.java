import java.util.Scanner;

public class ContStru{
    public static void main(String[] args) {
        // Scanner input  = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int time = input.nextInt();
        // if (time < 10) {
        //     System.out.println("Good Day");
        // }
        // else if (time < 18) {
        //     System.out.println("Good Evening");
        // }
        // else {
        //     System.out.println("Good Night");
        // }
            
        // int number =234;
        // double numD = number;
        // System.out.println(numD);
        
        // long ln =23445;
        // double fn = ln;
        // System.out.println(fn);
        
        // long finn =23445;
        // double dinn = finn;
        // System.out.println(dinn);

        System.out.println(Integer.MAX_VALUE);
       
        double dinnn = 12345678.400;
        System.out.println( (int) dinnn);

    // NARROWING CONVERSION
        double d = 625436577574345678.400;
        int num1 = (int) d;
        System.out.println(num1);

        int n = 1243456789;
        double n1 = Integer.valueOf(n).doubleValue();
        System.out.println(n - n1);
    }


}
