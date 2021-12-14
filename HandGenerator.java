import java.util.Formatter;

public class HandGenerator {
    public static void main(String[] args){
        Deck myDeck = new Deck();
        Player[] table = {new Player("North"), new Player("East"), new Player("South"), new Player("West")};
        char[] strangeColumn = {'0', 'n', 'e', 'b', 'n', 'e', 'b', '0'};

        // want: open a file for writing
        // write 8 lines of LIN
        try (Formatter output = new Formatter("newLINfile.lin")) {

            for(int i = 0; i < 8; i++){
                myDeck.dealCards(table);
                for(Player p: table){
                    p.sortHand();
                }
                output.format("qx|o%s|md|3%s,%s,%s|rh||ah|Board %s|sv|%s|pg||%n", i+1, table[0].handToString(), table[1].handToString(), table[2].handToString(), i+1, strangeColumn[i]);
                myDeck.returnCardsToDeck(table);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println("You done goofed");
        }

      
    }
}
