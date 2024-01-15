enum FarmObjects{
    Primary("Shovel"),
    Secondary("Sprinklers"),  
    Tertiary("Tractor");

    private String object;

    private FarmObjects(String object){
        this.object = object;
    }

    @Override
    public String toString() {
        return object;
    }
}

public class enumjest {
    public static void main(String[] args) {
        String item = FarmObjects.Primary.toString();
        System.out.println(item);

        for (FarmObjects fobj : FarmObjects.values()){ 
            System.out.println(fobj);
        }
    }
}
  