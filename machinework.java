class Vehicle {
    int powerOfEngine;
    double weight;

    int calculateSpeed(int powerOfEngine, int weight){
        int speed = weight/powerOfEngine;
        return speed;
    }
}
class car extends Vehicle{
    int numberOfSeats;
    int calculateSpeed(int numberOfSeats){
        int speed = numberOfSeats/powerOfEngine;
        return speed;
    }
    
    public void softShockAbsorbtion() {
        System.out.println("Soft Absorbtion");
    }
}
class Truck extends Vehicle{
    int Payload;
    
    int hardShockAbsorbtion(int Payload){
        return Payload;
    }
}

public class machinework {
    public static void main(String[] args) {
        Vehicle vc = new Vehicle();
        System.out.println(vc.calculateSpeed(12,23));
    
        Truck tr = new Truck();
        System.out.println(tr.hardShockAbsorbtion(12));

        car mycar = new car();
        mycar.softShockAbsorbtion();
   }
}
