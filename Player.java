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
        System.out.printf("%c%c", hand.get(0).getSuit(), hand.get(0).getValue());
        for(int i = 1; i < length; i++){
            if(hand.get(i).getSuit() == (hand.get(i-1).getSuit())){
                System.out.printf("%c", hand.get(i).getValue());
            } else {
                System.out.printf("%c%c", hand.get(i).getSuit(), hand.get(i).getValue());
            }
        }
        System.out.println();
    }

    public String handToString(){
        StringBuilder result = new StringBuilder();
        int length = hand.size();
        result.append(hand.get(0).getSuit());
        result.append(hand.get(0).getValue());
        for(int i = 1; i < length; i++){
           if(hand.get(i).getSuit() == hand.get(i-1).getSuit()){
            result.append(hand.get(i).getValue());   
           } else {
            result.append(hand.get(i).getSuit());
            result.append(hand.get(i).getValue());
           }
        }
        return result.toString();
    }

    public Card getCard(int i){
        return hand.get(i);
    }
}
