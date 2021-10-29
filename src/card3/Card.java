/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card3;

//import static javax.management.Query.value;

/**
 *
 * @author hasan
 */
  class Card implements Comparable
{
private int rank;
private int suit;
private int value;
Card(int r, int s)
{
rank = r;
suit = s;
}
int getRank()
{
return rank;
}
int getSuit()
{
return suit;
}
public int compareTo(Object ob)
{
Card other = (Card)ob;
int thisRank = this.getRank();
int otherRank = other.getRank();
if (thisRank == 1) thisRank = 14; // make aces high
if (otherRank == 1) otherRank = 14;
return thisRank - otherRank;
}
public boolean equals(Object ob)
{
if (ob instanceof Card)
{
Card other = (Card)ob;
return value==other.value && suit==other.suit;
}
else return false;
}
public String toString()
{
String val;
String [] suitList =
{ "", "Clubs", "Diamonds", "Hearts", "Spades" };
if (rank == 1) val = "Ace";
else if (rank == 11) val = "Jack";
else if (rank == 12) val = "Queen";
else if (rank == 13) val = "King";
else val = String.valueOf(rank); // int to String
String s = val + " of " + suitList[suit];
for (int k=s.length()+1; k<=17; k++) s = s + " ";
return s;
}

}  

