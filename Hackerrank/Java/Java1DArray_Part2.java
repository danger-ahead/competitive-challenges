import java.util.*;

public class Java1DArray_Part2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i;
        for (i = 0; i < game.length-1; i++){
            if (game[i+1] == 0) {
                if (i == game.length-1)
                    return true;
                continue;
            }
            if (game[i + leap] == 0 && (i + leap) == game.length - 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
