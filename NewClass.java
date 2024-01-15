import java.util.Scanner;

public class NewClass {
   private String name;
   private String subject;
   private int score;
    // Method
    void getHelp(String msg){
        //Method Body  
    }

    void newClass2(String name, String subject, int score){
        this.name =name;
        this.subject = subject;
        this.score = score;
    }

    void getGrade(String sub){
        System.out.println("Enter a subject");
        Scanner sc = new Scanner(System.in);
        sub = sc.nextLine();
        switch (sub){
            case "java" -> System.out.println("Quite easy");
            case "Python" -> System.out.println("Really Easy");
            case "Assembly" -> System.out.println("Assembly");
        }
    }
    //void getGrade(String name, double..)
    //  Method overloading --> Polymorphism
    static String doSomething(String word, int number, double... values){
        System.out.println(values[0]+values[1]+values[2]);
        return word;
    }
    
    public static void main(String[] args) {
        doSomething(null, 23, 24.4,56.5, 90);


        System.out.println("JAVA CLASS");
        //NewClass nc = new NewClass();
        // nc.getHelp("name"); 
        
    }
}
