public class HandGenerator {
    public static void main(String[] args){

        Deck myDeck = new Deck();

        System.out.println();

        Player[] table = {new Player("North"), new Player("East"), new Player("South"), new Player("West")};

        myDeck.dealCards(table);

        for(Player p : table){
            p.sortHand();
            System.out.println(p.handToString());
            
        }

        myDeck.display();
      
    }
}
