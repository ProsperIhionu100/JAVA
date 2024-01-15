class machine{
    public void engine(){
        System.out.println("This machine has an engine");
    }
}
class car extends machine{
    
    @Override
    public void engine(){
        System.out.println("This car has an engine"); 
        }
    void wheels(){
        System.out.println("This machine is a car and it has wheels");
    }
}

class computer extends machine{
    public void engine(){
    // super.engine();
        System.out.println("This is a computer and it has a motherboard");
    }
}

public class machinetools {
    public static void main(String[] args) {
        machine mc = new machine();
        mc.engine();

        car ca = new car();
        ca.engine();
        ca.wheels();

        computer com = new computer();
        com.engine();
    }
}
