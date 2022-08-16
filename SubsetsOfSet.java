import java.util.ArrayList;

public class SubsetsOfSet {
    public static void prinSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++)
            System.out.print(subset.get(i) + " ");
        System.out.println();
    }
    // O(2^n)

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            prinSubset(subset);
            return;
        }

        // add the number
        subset.add(n);
        findSubsets(n - 1, subset);

        // don't add the number
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
