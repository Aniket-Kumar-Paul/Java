import java.util.Scanner;

import javax.swing.border.SoftBevelBorder;

public class Main {
    public static void main(String[] args) {
        // String Builder -> used for efficient string operations as strings are immutable
        StringBuilder sb = new StringBuilder("Aniket");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        
        // setCharAt - changing the string (builder)
        sb.setCharAt(0, 'C'); // (index, 'single character')
        System.out.println(sb);

        // insert
        sb.insert(1, "hi"); // (index, "string")
        System.out.println(sb);

        // delete
        sb.delete(2, 4); // (start, end) [excluding end]
        System.out.println(sb); 

        // append
        sb.append("er");
        System.out.println(sb);

        // length
        System.out.println(sb.length());
    }
}
