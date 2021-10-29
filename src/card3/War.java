
package card3;
import card3.*;
/**
 *
 * @author hasan
 */
  public class War
{
public static void main(String [] args)
{
Game g = new Game();
g.play();
Player winner = g.getWinner();
if (winner == null) System.out.println("Tie game.");
else System.out.println("\nWinner = "
+ winner.getName());
}
}   

  

