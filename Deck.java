import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                deck.add(new Card(i, j));
            }
        }
    }

    public Card removeRandomCard(){
        Random random = new Random();
        Card result = deck.get(random.nextInt(deck.size()));
        deck.remove(result);
        return result;
    }

    public void dealCards(Player[] table){
        for(Player p : table){
            for(int i = 0; i < 13; i++){
                p.addCard(removeRandomCard());
            }
        }
    }

    public void display(){
        int length = deck.size();
        for(int i = 0; i < length; i++){
            if(i % 13 == 0)
                System.out.printf("%s", deck.get(i).getSuit());
            System.out.printf("%s", deck.get(i).getValue());
            if(i % 13 == 12)
                System.out.println();
        }
        System.out.println();
    }
}
