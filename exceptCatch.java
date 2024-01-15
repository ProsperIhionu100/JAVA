class ExceptMath{
    public void runMethod(String input){
        try {
           if (input.equals("abc")){
                System.out.println("Equals");
           } 
           else{
            System.out.println("Not Equal");
           }
           System.out.println("Input received ----------- " + input );
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }
}

public class exceptCatch {
    public static void main(String[] args) {
        ExceptMath mat = new ExceptMath();
        mat.runMethod(null);
    }
}
