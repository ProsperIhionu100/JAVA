import java.net.Socket;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class second {
    public static void main(String[] args){

        NumberFormat nf =NumberFormat.
        getCompactNumberInstance(Locale.US, NumberFormat.Style
        .LONG);
        System.out.println(nf.format(45_000));
        System.out.println(nf.format(45_000_000));
        
        NumberFormat nff =NumberFormat.
        getCurrencyInstance(Locale.UK);
        String values =  nff.getCurrency().getDisplayName();
        double money = 1345.87;
        System.out.println(values);
        System.out.println(nff.format(money));
    
        NumberFormat form =NumberFormat.
        getCurrencyInstance(Locale.US);
        String val =  form.getCurrency().getDisplayName();
        double Ego = 1345.87;
        System.out.println(val);
        System.out.println(form.format(Ego));
    
        NumberFormat percentFormat =NumberFormat.
        getPercentInstance();
        String numper =  percentFormat.format(0.43);
        System.out.println(numper); 
    
        String s0 ="abc",s9 ="abc";
        System.out.println(s0==s9);

        String o1 = new String("abc");
        String o2 = new String("abc");

        System.out.println(o1 ==o2);
        String html = "<html>\n" +
                            "<body>\n"+
                            "<p>Hello World<p>"+"</body\n>"+
                        "<html>\n";

        System.out.println(html);

        String name = "Munirat";
        System.out.println(name.length());
    
        String s1 = "abc";
        String s2 = "abc";
    
    if (s1 ==s2){
            System.out.println("Both Strings are Equal");
    }else{
        System.out.println("Both Strings are Unequal");
    }
    
    String x1 = new String("sde");
    String x2 = new String("sde");
    
    if (x1 ==x2){ 
     System.out.println("Both Strings are Equal");
    }else{
        System.out.println("Both Strings are Unequal");
    }
        // Scanner input =  new Scanner(System.in);
        // System.out.println("Enter a name");
        // String name2 = input.next();
        // System.out.println("Welcome to java" + name2);
        
    }
}

 