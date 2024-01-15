enum pizzaOrder{
    Ordered("2"),
    Delivered("3"),
    ready("2");
    
    private String object;

    private pizzaOrder(String object){
        this.object = object;
    }

    @Override
    public String toString() {
        return object;
    }

}



public class PizzaEnum{
    public static void main(String[] args) {
        String  pizza1 = pizzaOrder.Ordered.toString();
        System.out.println(pizza1);
    }
}