import java.util.Scanner;

public class poker {

    public static void main(String[] args) {

        int[] block = new int[52];
        for (int i = 0; i < block.length; i++) {                    // array filling of 1 to 52
            block[i] = i+1;
        }

        System.out.println(" quantity player ?");                   //n-number of players
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println( );

        for (int j = 0; j < n; j++) {                               // identification of the number of the player
            int playernumber= j + 1;
            System.out.println( playernumber + " player cards ");

            for (int i = 0; i < n * 5; i += n) {                    // Each player is dealt 5 cards
                block[i] = block[i + j];
                System.out.print(block[i] + "\t");
            }

            System.out.println();
            System.out.println();
        }
    }

}
