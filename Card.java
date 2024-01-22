
public class Card {

    char data;
    boolean status = false;

    public Card(char x) {
        data = x;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
