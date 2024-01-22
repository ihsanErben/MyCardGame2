
import java.util.Scanner;

public class CardProccess {

    Scanner input = new Scanner(System.in);

    public void tryToGuess(Card[][] c) {
        int a = 1;
        while (a == 1) {
            System.out.println("----------------------");
            System.out.print("[First] x , y   -->   ");
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println("----------------------");
            if (x < 0 || x > 3 || y < 0 || y > 3) {
                System.out.println("                                          [First] x,y are between 0-3");
                continue;
            } else if (c[x][y].status) {
                System.out.println("                                            Card[" + x + "][" + y + "] was already openned");
                continue;
            }

            c[x][y].status = true;
            printTable(c);
            System.out.println("----------------------");
            System.out.print("[Second] x , y   -->   ");
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            System.out.println("----------------------");
            
            if (x2 < 0 || x2 > 3 || y2 < 0 || y2 > 3) {
                System.out.println("                                          [Second] x,y are between 0-3");
                c[x2][y2].status = false;
                continue;
            } else if (c[x2][y2].status) {
                System.out.println("                                            Card[" + x2 + "][" + y2 + "] was already openned");
                c[x2][y2].status = false;
                continue;
            }

            c[x2][y2].status = true;
            printTable(c);

            if (c[x][y].data == c[x2][y2].data) {
                System.out.println("");
                System.out.println("     Matching");
                c[x2][y2].status = true;
            } else {
                System.out.println("");
                System.out.println("     Non-Matching");
                c[x][y].status = false;
                c[x2][y2].status = false;
            }

            if (isTableFinisted(c)) {
                a = 0;
                return;
            }
            System.out.println("");
            printTable(c);
            System.out.println("-------------------------------------------------------------");
        }
    }

    public void printTable(Card[][] c) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (c[i][j].status) {
                    System.out.print(" | " + c[i][j].data + " | ");
                } else {
                    System.out.print(" |   | ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public boolean isTableFinisted(Card[][] c) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (c[i][j].status == false) {
                    return false;
                }
            }
        }
        return true;
    }
}
