class Num{
    int n=4;
    void display(){
        int r=n*n;
        System.out.println("Square of "+n+" is "+r);
    }
}

public class Square {
    public static void main(String[] args) {
        Num m=new Num();
        m.display();
    }
    
}
