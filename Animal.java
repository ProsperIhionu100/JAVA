class Animalprop {
   public void animalsound(){
    System.out.println("This is my animal");
   } 
}
class Dog extends Animalprop{
   public void animalsound(){
   super.animalsound();
    //System.out.println("This is the Dog");
   } 
}
class Cat extends Dog {
   
}

public class Animal{
   public static void main(String[] args) {
      Animalprop myDog = new Animalprop();
      myDog.animalsound();

      Dog dg = new Dog();
      dg.animalsound();

      Cat  ct =new Cat();
      ct.animalsound();
   }
}