// 1. move n-1 disks to Helper & nth disk to Destination
// 2. move n-1 disks from Helper(Source) to Destination using Source as Helper

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + s + " to " + d);
            return;
        }       
        towerOfHanoi(n - 1, s, d, h);
        System.out.println("transfer disk " + n + " from " + s + " to " + d);

        towerOfHanoi(n-1, h, s, d);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}

// complexity - T(n) =  2T(n-1)+1  => O(2^n)