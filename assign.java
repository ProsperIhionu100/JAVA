// Write a program to convert Fahrenheit to celsius
//Hint float temp;

// Write a program to calculate the perimeter and area of a triangle

//  

import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
    // convert Fahrenheit to Celcius
      float temp = 19.4f;
      float f = (9/5 *temp) +32; 
      System.out.println(f);
    
      //calculate the Area and perimeter of a rectangle
        int width = 23;
        int height =42;
        int Area =  width *height;
        System.out.println(Area);
        int Per = 2*(height +width);
        System.out.println(Per);
        // calculate the Square of a number
        int num1 =2;
        System.out.println(num1*num1);
        // Check if a number is even or odd
        int num =2;
        int check = num % 2;

    if (check== 0){
            System.out.println("This is an even number "+ num);
    }else{
            System.out.println("This is an odd num");
    }   
        // compare a give name with the user input name
        String name = "Prosper";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name2 = input.next();
        //name =name2;
    if (name.equals(name2)  ){
            System.out.println("They are equal");
    }else{
        System.out.println("They are not equal");
    }
    }    
}
