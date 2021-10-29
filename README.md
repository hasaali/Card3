The Game of War
Illustrate the process of designing an object-oriented solution to a small problem by simulating War,
a two-person game that uses a deck of playing cards. The rules of the game act as an initial specification 
of the problem. A card deck consists of 52 playing cards, each of which has a numeric value between 1 and 13,
called the rank of the card, and one of four suits (clubs, diamonds, hearts, and spades). The values 1, 11, 12, and 13
have special names: ace, jack, queen, and king, respectively. To play the game we deal the entire deck of cards to two players.
Each player has a pile of 26 cards face down on the table. During a turn of the game, 
the players show the top cards from their piles, and the player with the higher-ranking card wins both cards,
putting them faceup in a pile. To comparison, aces count as highest. If the cards shown by the players have the same rank,
each player places the number of cards equal to that rank face down on the table. The last cards played 
by each player are turned over and compared. The higher value wins all the cards that have been played this turn.
If another tie occurs, the process is repeated. When a player finish playing all the cards in his or her playing pile, 
the cards won in previous turns are turned over and become a new playing pile. If either player cannot complete 
a turn for lack of cards, the other player wins the game. The goal of this program is to simulate the playing of
a game of War with two players, named Ali and Matthew.
