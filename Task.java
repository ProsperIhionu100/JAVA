import java.util.Scanner;
import java.util.stream.Stream;

public class Task {

   public static void main(String[] args){
      
      // Type Casting
      System.out.println(Short.MAX_VALUE);
      int p = 4056;
      short c = (short) p;
      System.out.println(c);
      
      // Find the number of arguments provided at runtime
      long count1 = Stream.of(1,2,3).count();
      System.out.println(count1);

      // Test for prime number
      int num = 8;
      int cal= num % 2;
      // System.out.println(cal);
      if (cal == 0 ) {
         System.out.println("This is an even number");
      } else if(cal==1){
            System.out.println("This is an odd number");
      
      } else{
         System.out.println("This is not a number");
      }

      // Simple interest
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a parameter");
      int prin, rate , time;
      prin = input.nextInt();
      rate = input.nextInt();
      time = input.nextInt();

      int si = (prin * rate * time )/100;
      System.out.println(si);
   }
}

// Last One 
class CalArea{
   private int width;
   private int length;
    // private int age;
   public int getWidth(){ 
        return width;
   }
   public int getLength(){ 
        return length;
   }
    
   public CalArea(int width, int length){
        this.width = width;
        this.length = length;
   }
   public void findArea(){
      int area = length * width;
      System.out.println(area);
   }
   
   public static void main(String[] args) {
      CalArea cl = new CalArea(6,9);
      cl.findArea();
   }
   
}
