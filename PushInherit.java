class Person{
    public String outputName(){
        return "name";
    }
}

class Subject extends Person{
    String name = "Johnson";
    @Override
    public String outputName(){
        return "The Name is " + name;
    }
}




public class PushInherit {
    public static void main(String[] args) {
        Person p = new Subject();
        System.out.println(p.outputName());

        //Person p1 = new Person();
    }
}
