import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class convertus {
    public static void main(String[] args) {
        NumberFormat nf =  NumberFormat.getCurrencyInstance(Locale.US);
        String num = nf.getCurrency().getDisplayName();
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number");
        float num1 =input.nextFloat();
        System.out.println(num);
        System.out.println(num +  nf.format(num1));
        }
}
