import java.util.*;

class SimpleInterest {
    double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();

        SimpleInterest obj = new SimpleInterest();

        double si = obj.calculateSI(p, r, t);

        System.out.println("Simple Interest = " + si);
        
    }
}
