import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Strings --> Immutable
        String myName = "Aniket Paul";
        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();
        System.out.println("Your name is : " + yourName);

        // String functions 
        String s1 = "Hey";
        String s2 = "Hi";
        String s3 = s1 + " " + s2; // concatenation
        System.out.println(s3);
        System.out.println(s3.length()); // length

        for (int i=0; i<s3.length(); i++) {
            System.out.println(s3.charAt(i)); // charAt
        }

        // compareTo 
        //      - s1 > s2 : +ve value
        //      - s1 = s2 : 0
        //      - s1 < s2 : -ve value
        if(s1.compareTo(s2) == 0) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }

        // substring(beg index, end index) [end excluded]
        String firstName = myName.substring(0, 6);
        // String lastName = myName.substring(7, myName.length());
        String lastName = myName.substring(7); // same as above (takes last index as end index by default)
        System.out.println(firstName);
        System.out.println(lastName);

        // parseInt 
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // toString
        String newstr = Integer.toString(number);
    }
}
