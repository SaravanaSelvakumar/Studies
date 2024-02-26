import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("enter student name marks");
        String name = "Peter 35", name2 = "Tom 45";


        int lastTwoDigitsName = extractLastTwoDigits(name);
        int lastTwoDigitsName2 = extractLastTwoDigits(name2);

        int sum = lastTwoDigitsName + lastTwoDigitsName2;

        System.out.println("Sum of the last two digits: " + sum);
    }

    private static int extractLastTwoDigits(String str) {
        String lastTwoDigits = str.substring(str.length() - 2);
        return Integer.parseInt(lastTwoDigits);

    }
}
