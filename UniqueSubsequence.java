import java.util.HashSet;

public class UniqueSubsequence {
    public static void uniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if(idx==str.length()){
            if(set.contains(newString))
                return;
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // include currChar
        uniqueSubsequence(str, idx+1, newString+currChar, set);
        // don't include currChar
        uniqueSubsequence(str, idx+1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str, 0, "", set);
    }
}

// O(2^n)