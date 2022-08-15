public class PrintKeypadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printCombination(str, 0, "");
    }
}

// For 23 (2:def, 3:ghi)
// d__
//   |_dg
//   |_dh
//   |_di
// e__
//   |_eg
//   |_eh
//   |_ei
// f__
//   |_fg
//   |_fh
//   |_fi

// O(4^n) -> since 6:pqrs has 4