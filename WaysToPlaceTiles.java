// Place 1xm tiles in nxm floor

public class WaysToPlaceTiles {
    public static int placeTiles(int n, int m) {
        // Base Cases
        if (n == m) // can place all tiles horizontally or vertically
            return 2;
        if (n < m) // can place only horizontally
            return 1;

        // placing vertically
        int verticalPlacements = placeTiles(n - m, m);
        // placing horizontally
        int horizontalPlacemets = placeTiles(n - 1, m);

        return verticalPlacements + horizontalPlacemets;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(placeTiles(n, m));
    }
}
