class Numbers{
    int a=10;
    void check(int a){
        if(a%2==0){
            System.out.println(a+" is even");
        }
        else{
            System.out.println(a+" is odd");
        }

    }
}

public class evenOrOdd {
    public static void main(String[] args) {
        Numbers n=new Numbers();
        n.check(n.a);
    }
    
}
