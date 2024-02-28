public class Last {
    public static void main(String[] args) {

        String name = "samr60";
        String name2 = "tom 70";

        String nameLastTwoDigits = name.substring(name.length()-2);
        String name2LastTwoDigits = name2.substring(name2.length() - 2);

        int lastTwoDigitsName = Integer.parseInt(nameLastTwoDigits);
        int last2TwoDigitsName = Integer.parseInt(name2LastTwoDigits);
        int add =lastTwoDigitsName+last2TwoDigitsName;

        System.out.println(lastTwoDigitsName);
        System.out.println(last2TwoDigitsName);
        System.out.println(add);
    }
}