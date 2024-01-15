import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     try{
    //     int num =  input.nextInt();
    //     // int num1 =  input.nextInt();
    //     }catch(Exception e){
    //         System.out.println("cannot divide by 0");
    // }
    int arr[] = {2,4,0}, num1= 20 ,result, index;
    try {
        System.out.println("Enter the index:::");
        index = new java.util.Scanner(System.in).nextInt();
        result = num1 / arr[index];
        System.out.println("The result is:" + result);
    } catch (ArithmeticException e) {
       System.out.println("Arithemetic Error occured");
    } catch (ArrayIndexOutOfBoundsException ae) {
       System.out.println("Arithemetic Error occured");
       ae.printStackTrace();
       ae.getMessage();
       ae.getCause();
    }
    }
}
