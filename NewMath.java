interface Calculate{
    public void sum();
    public void multiply();
    public void getName(String name);
}

public class NewMath implements Calculate{
    public void getName3(String name){
        System.out.println(name);
}

    public static void main(String[] args) {
        NewMath nw = new NewMath();
        nw.getName3("Prosper");
        }        
}       

