class Truck1 {
    void wheel(){
        System.out.println("This truck has wheels");
    }

}
class Train extends Truck1{
    void Trainrails(){
        System.out.println("This train run on rails");
    }
}




public class inherit1 {
    public static void main(String[] args) {
        Truck1 tr = new Truck1();
        Train t = new Train();
        t.Trainrails();
        tr.wheel();
        t.wheel();
}
}
    