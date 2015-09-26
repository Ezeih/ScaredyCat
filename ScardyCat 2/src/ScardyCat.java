import java.io.IOException;

public class ScardyCat
{

	public static void main(String[] args) throws Exception
	{
		int scareCrowNumber = 0;
		int playerNR = Integer.parseInt(args[0]);
		Cards currentCard;
		PlayerList players = new PlayerList(playerNR);
		Player currentPlayer;
		CardDeck cardDeck = new CardDeck();
		UpdateGraphics graphics = new UpdateGraphics();
		char ch;
		
		while (scareCrowNumber < 6)
		{	currentPlayer = players.getNext();
			currentCard = cardDeck.getNextCard();
			graphics.updateCards(currentCard, currentPlayer, scareCrowNumber);
			ch = (char) System.in.read();
			while (ch == '\n')
			{
				
				if (currentCard instanceof Bird)
				{
					currentPlayer.addCards(currentCard);
				}
				if (currentCard instanceof ScareCrow)
				{
				
					scareCrowNumber += 1;
					
				}
				else if (currentCard instanceof Cat)
				{
					currentPlayer.removeCards();
					cardDeck.addCards(currentPlayer.getPlayerCards());
				}
				ch = 'q';

			}
		}
		
		System.out.println("The game has finished!!");
		for (int i = 0; i < playerNR; i++)
		{
			Player nextPlayer = players.getNext();
			System.out.println(nextPlayer.name + " got " + nextPlayer.getnumberOfCards() + " Cards ");
			System.out.println(nextPlayer.getNumberOfPoints() + " number of Birds");

		}

	}

}
