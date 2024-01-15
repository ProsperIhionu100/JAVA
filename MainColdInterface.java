interface DB{
    void gethelp();

    default void getsize(double size){
        double carrier = 1024.257;
        double DBSize = size *carrier;
    }
    static void getLocation(String location){
        String findLocator;
        String throughPut = "Checking for DB Location and File Destination";
        System.out.println(throughPut);
        findLocator = location;
        System.out.println(findLocator);
    }

}

public class MainColdInterface implements DB{
    public void getType(){
            System.out.println("Type Autonomous DataBase");
    }
    public static void main(String[] args) {  
       MainColdInterface atd = new MainColdInterface();
       atd.getType();
       atd.getsize(100.22);
       DB.getLocation("Amazon Cloud WebServices");
    }
    @Override
    public void gethelp() {
        throw new UnsupportedOperationException("Unimplemented method 'gethelp'");
    }
}
