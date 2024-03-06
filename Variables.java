public class Variables {
    public static void main(String[] args) {
        String a = "water";
        String b = "juice";
        String temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("x : " + a);
        System.out.println("y : " + b);
    }
}
