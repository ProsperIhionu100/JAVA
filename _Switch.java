import java.util.Scanner;

public class _Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total Vote");
        int pdp = input.nextInt();
        // System.out.println(pdp);
        int apc = input.nextInt();
        int lp = input.nextInt();
        
        String pdp_cand = "Atiku Abubakar";
        String apc_cand = "Bola Tinu";
        String lp_cand = "Peter Obi";

        if (pdp > apc && pdp >lp) {
            System.out.println(pdp_cand+" won");
        }
        else if (apc > pdp && apc >lp) {
            System.out.println(apc_cand+" won");
        }
        else if (lp > pdp && lp > apc) {
            System.out.println(lp_cand+" won");
        }
        else{
            System.out.println("This election was rigged");
        }
    }
}
