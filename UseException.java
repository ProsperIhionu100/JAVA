import java.util.Scanner;

public class UseException {
    static void throwsMet() throws IllegalAccessException{
        System.out.println("Inside throwsMet");
        throw new IllegalAccessException("exception");
    }
    public static String assertSomething(int x,int y, String msg) {
            if (x>=y) {
                System.out.println("Greater");
                return "Greater";
            }
            else {System.out.println("Less");}
            return "Less";
        }
    public static void main(String[] args) {
        // String name = "Promise";
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String input_name = sc.nextLine();
        // assert name == input_name: "The Same name";
        // boolean asrt;
        // asrt = assert(name, input_name);
        // System.out.println(asrt);

        
        int ring = 3;
        System.out.println("Enter number");

        int input = sc.nextInt();
        assert(assertSomething(input, ring, "null"));

        
        UseException ue = new UseException();
        try {
            ue.throwsMet();
            throw new NotAvailableException();
        } catch (Exception e) {
           System.out.println("Exception caught");
           e.printStackTrace(); 
           e.getMessage(); 
        } 
 sc.close();
    }
}

class StrMethods{
    public static void main(String[] args) {
        String guess = "prosper";
        int lenghts = guess.length();

        System.out.println(lenghts);

        System.out.println(guess.isEmpty());
        System.out.println(guess.lastIndexOf("pro"));
        System.out.println(guess.indexOf("pro"));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter username");
        // String input = sc.nextLine();
        // boolean right = input.matches("[a-z]+"); // checking if input is all alphabets
        // System.out.println(right);

    }
}