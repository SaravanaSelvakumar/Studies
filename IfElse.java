import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a value");
        int a = scan.nextInt();

        if (a == 24) {
            System.out.println("its midnight");
        } else if (a >= 20) {
            System.out.println("its dinner time");
        } else if (a > 17) {
            System.out.println("its to early for dinner");
        } else if (a >= 16) {
            System.out.println("its tea time");
        } else if (a > 11) {
            System.out.println("lunch");
        }
             else if (a > 8) {
                System.out.println("breakfast");
        } else if (a >=6) {
            System.out.println("breakfast");
        }
             else {
            System.out.println("y are u not sleeping");
        }
    }
}
