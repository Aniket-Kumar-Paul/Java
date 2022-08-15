public class SubSequencesOfString {
    // subsequence -> each character has choice to be included or not included but
    // order should be same
    public static void subsequences(String str, int idx, String newString) {
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // include currChar
        subsequences(str, idx+1, newString+currChar);
        // don't include currChar
        subsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "Ani";
        subsequences(str, 0, "");
    }
}

// Complexity :-
// each function calls 2 times,...total subsequences(last level) = 2^n
// 2nd last level = 2^(n-1)
//                    ...
//                     1
// time complexity = 1 + ... + 2^(n-1) + 2^n
//                 = a(r^n - 1)/(r-1) = 1(2^(n+1) - 1)/(2-1)
//                 = O(2^n)