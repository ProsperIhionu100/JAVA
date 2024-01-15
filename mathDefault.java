class mathCal{

    // default secCal(){
    //     return
    // }
}



interface math{
    // void firstMethod();
    // String secondMethode(int number );

    default int firstMethod(){
        return getSalary();
    }

    default int thirdMethod(){
        return getSalary() +12/100;
    }
    private int getSalary(){
        return 750;
    }
    public static void main(String[] args) {
        math mt = new math();
    }
}
