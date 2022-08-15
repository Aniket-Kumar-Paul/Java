// 1. make an array of size 26 (26 letters)
// 2. currChar-'a' -> gives index of the characted in the array
//      Eg: 'b' - 'a' = 1 (index of b = 1)

public class RemoveDuplicatesInString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'])
            removeDuplicates(str, idx + 1, newString);
        else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabdfssdsf";
        removeDuplicates(str, 0, "");
    }
}
