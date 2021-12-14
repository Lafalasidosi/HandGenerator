import java.util.Formatter;

public class HandGenerator {
    public static void main(String[] args){
        Deck myDeck = new Deck();
        Player[] table = {new Player("North"), new Player("East"), new Player("South"), new Player("West")};
        myDeck.dealCards(table);

        for(Player p: table){
            p.sortHand();
        }
       
        // want: open a file for writing
        // write 8 lines of LIN
        try (Formatter output = new Formatter("newLINfile.lin")) {
            output.format("qx|o1|md|3%s,%s,%s|rh||ah|Board 1|sv|0|pg||", table[0].handToString(), table[1].handToString(), table[2].handToString());
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println("You done goofed");
        }

      
    }
}
