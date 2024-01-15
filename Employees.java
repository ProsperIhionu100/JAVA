class Employee1{
    int id;
    String name;
    String title;
    void employeesInfo(){
        
    }
    void employeesTask(){
        
    }
    public double employeesSalary(double  num){
      return 3.89;  
    }
}

class Emp extends Employee1{
    public void DepartmentInfo (){
        name = "Production Team";
        title = "Department Head";
        System.out.println(name + title);
    }

    public void employeesTask(){
        System.out.println("Production of Goods and Services");
    }
    public double employeesSalary(){
       return super.employeesSalary(12.9);
    }
}

public class  Employees{
    public static void main(String[] args) {
        Emp e = new Emp();
        System.out.println(e.employeesSalary());
    }
}