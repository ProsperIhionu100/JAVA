public class NotAvailableException extends Exception{
    public NotAvailableException(){
        System.out.println("Not Available");
    
    }
    // public static void main(String[] args) {
    //     NotAvailableException exep = new NotAvailableException();
    //     exep.NotAvailableException();
    // }
}

class UserException{
    public static void main(String[] args) {
        UserException ue = new UserException();
        try {
            ue.throwsMet();
            throw new NotAvailableException();
        } catch (Exception e) {
           System.out.println("Exception caught");
           e.printStackTrace(); 
           e.getMessage(); 
        } 
    }
}