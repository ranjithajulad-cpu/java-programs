public class Student {
    int rollNo=101;
    String name="Ravi";
    void display(){
        System.out.println(rollNo);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.display();

    }
    
}
