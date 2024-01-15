import java.util.Scanner;

public class demo_switch {

    Scanner inp = new Scanner(System.in);
    int num1;

    void number(){
        System.out.println("Enter a number");
        num1 =inp.nextInt();
        switch(num1){
            case 1->
                System.out.println("Hello");
            case 2->
                System.out.println("How are you");
            case 3->
                System.out.println("Good Morning");    
            case 4 ->
                System.out.println("i am fine");
            default-> 
                System.out.println("you are done");
        }
    }

    public static void main(String[] args) {
        demo_switch mycase = new demo_switch();
        mycase.number();
    }
}
