class Num{
    int a=60;
    int b=70;
    void display(){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }

}

public class Largest {
    public static void main(String[] args) {
        Num l=new Num();
        l.display();
    }
    
}
