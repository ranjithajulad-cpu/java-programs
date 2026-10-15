class details{
    int empid=1;
    String name="Ranjitha";
    int salary=10000;
    void display(){
        System.out.println("EMployee Id: "+empid);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);

    }
}

public class Employee {
    public static void main(String[] args){
        details d= new details();
        d.display();

    }
    
}
