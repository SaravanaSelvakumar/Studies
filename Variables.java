public class Variables {
    public static void main(String[] args) {
        int sum1 = 10;
        int sum2 = 5;
        int sum3;
        sum3 = sum1;
        sum1 = sum2;
        sum2 = sum3;

        System.out.println(sum1);
        System.out.println(sum2);

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
