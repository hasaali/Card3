
package card3;

/**
 *
 * @author hasan
 */
 public class Game
{
void play()
{
CardDeck cd = new CardDeck();
cd.shuffle();
p1 = new Player("Ali");
p2 = new Player("Matthew");
while (cd.getSize() >= 2)
{
p1.collectCard(cd.deal());
p2.collectCard(cd.deal());
}
p1.useWonPile();
p2.useWonPile();
Pile down = new Pile(); // Pile for cards in a war
loop: for (int t=1; t<=100; t++)
{
if (!enoughCards(1)) break loop;
Card c1 = p1.playCard();
Card c2 = p2.playCard();
System.out.println("\nTurn " + t + ": ");
System.out.print(p1.getName() + ": " + c1 + " ");
System.out.print(p2.getName() + ": " + c2 + " ");
if (c1.compareTo(c2) > 0)
{
p1.collectCard(c1); p1.collectCard(c2);
}
else if (c1.compareTo(c2) < 0)
{
p2.collectCard(c1); p2.collectCard(c2);
}
else // War
{
down.clear();
down.addCard(c1); down.addCard(c2);
boolean done = false;
do
{ int num = c1.getRank();
if (!enoughCards(num)) break loop;
System.out.print("\nWar! Players put down ");
System.out.println(num + " card(s).");
for (int m=1; m<=num; m++)
{
c1 = p1.playCard(); c2 = p2.playCard();
down.addCard(c1);
down.addCard(c2);
}
System.out.print(p1.getName()+": "+ c1 + " ");
System.out.print(p2.getName()+": " + c2 + " ");
if (c1.compareTo(c2) > 0)
{ p1.collectCards(down);
done = true;
}
else if (c1.compareTo(c2) < 0)
{ p2.collectCards(down);
done = true;
}
}
while (!done);
} // end of for t=1 to 100
System.out.println(p1.numCards() + " to "
+ p2.numCards());
}
}
boolean enoughCards(int n)
{
if (p1.numCards() < n || p2.numCards() < n)
return false;
return true;
}

Player getWinner()
{
if (p1.numCards() > p2.numCards())
return p1;
else if (p2.numCards() > p1.numCards())
return p2;
else
return null;
}
private Player p1, p2;
}
