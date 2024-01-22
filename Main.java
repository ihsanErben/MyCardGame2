
public class Main {

    public static void main(String[] args) {

        Card[][] card = new Card[4][4];

        card[0][0] = new Card('A');
        card[0][1] = new Card('B');
        card[0][2] = new Card('C');
        card[0][3] = new Card('D');

        card[1][0] = new Card('E');
        card[1][1] = new Card('F');
        card[1][2] = new Card('G');
        card[1][3] = new Card('H');

        card[2][0] = new Card('A');
        card[2][1] = new Card('B');
        card[2][2] = new Card('C');
        card[2][3] = new Card('D');

        card[3][0] = new Card('E');
        card[3][1] = new Card('F');
        card[3][2] = new Card('G');
        card[3][3] = new Card('H');
        System.out.println("-------------------------------------------------------------");
        CardProccess x = new CardProccess();
        x.tryToGuess(card);
    }
}
