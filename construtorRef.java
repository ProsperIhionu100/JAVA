class Person{
   void getType() {
        System.out.println("Type");
    }  
}


class Student extends Person{
    String name; int rollNo;
    Student(String name, int rollNo){
        this.name =name;
        this.rollNo =rollNo;
    }
    public void getScore(){
        System.out.println("Score");
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + rollNo +
                ", name'"+ name + '\'' +
                '}';
    }

    static void getrollCall(){ // Stactic Method
        System.out.println("ROLL CALL");
    }

    public static void main(String[] args) {
        Student student = new Student("Munirat", 10);
        Person p = new Student("John", 110);
        (Student) p.getScore(); //casting
        System.out.println(student.name);
        student.getScore();
        Student.getrollCall();
    }
}
