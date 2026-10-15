import java.util.Scanner;

class MultiplicationTable {
    void displayTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MultiplicationTable obj = new MultiplicationTable();
        obj.displayTable(n);

        sc.close();
    }
}
