// guests can be invited either single or in pairs

public class WaysToInviteGuests {
    public static int callGuests(int n) {
        if(n<=1)
            return 1;
        
        int singleWays = callGuests(n-1);
        int pairWays = (n-1)*callGuests(n-2);
        return singleWays + pairWays;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuests(n));
    }
}
