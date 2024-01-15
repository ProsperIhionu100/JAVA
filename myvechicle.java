class myvechicle {
    String wheels= "tyres";
    int doors = 4;
    int  side_mirror  = 2;

    public String doors_get(){
        return wheels;
    }


public static void main(String[] args) {
        myvechicle cr = new myvechicle();
        System.out.println(cr.doors_get());
}
    }