public class Card {
    // Suits range from 0-3 (Clubs, Diamonds, Hearts, Spades)
    // There will be a conversion method to go from 0-12 -> 2,3,4...Q,K,A
    private int suit;
    private int denomination;

    public Card(int suit, int denomination){
        this.suit = suit;
        this.denomination = denomination;
    }

    public String getSuit(){
        switch(suit){
            case 0: return "C";
            case 1: return "D";
            case 2: return "H";
            default: return "S";
        }
    }
    
    public String getValue(){
        switch(denomination){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
            case 5: 
            case 6:
            case 7:return Integer.toString(denomination + 2);
            case 8: return "T";
            case 9: return "J";
            case 10: return "Q";
            case 11: return "K";
            default: return "A";

        }
    }

    public int getSuitInt(){
        return suit;
    }

    public int getDenomination(){
        return denomination;
    }
}