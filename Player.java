import java.util.ArrayList;
import java.util.Comparator;

public class Player {
    private String seat;
    private ArrayList<Card> hand;

    public Player(String seat){
        this.setSeat(seat);
        this.hand = new ArrayList<Card>();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void addCard(Card c){
        hand.add(c);
    }

    public void sortHand(){
        // sort by suit then by value
        hand.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getDenomination).reversed());
    }

    // I need this output as a string: it now looks like the 
    public void showHand(){
        int length = hand.size();
        System.out.printf("%s%s", hand.get(0).getSuit(), hand.get(0).getValue());
        for(int i = 1; i < length; i++){
            if(hand.get(i).getSuit().equals(hand.get(i-1).getSuit())){
                System.out.printf("%s", hand.get(i).getValue());
            } else {
                System.out.printf("%s%s", hand.get(i).getSuit(), hand.get(i).getValue());
            }
        }
        System.out.println();
    }
}
