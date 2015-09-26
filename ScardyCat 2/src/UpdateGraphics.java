public class UpdateGraphics
{
	void updatePlayer()
	{
		// prints player name
	}

	void updateCards(Cards currentCard, Player currentPlayer, int scareCrowNumber)
	{
		String playerName = currentPlayer.name;

		System.out.println("Player " + playerName + " got:");
		if (currentCard instanceof Bird)
		{
			birdsNr(currentCard);
		}
		if (currentCard instanceof Cat)
		{
			cat(currentPlayer);
		}
		else if (currentCard instanceof ScareCrow)
		{
			scareCrow();
		}
	}

	void cat(Player currentPlayer)
	{

		System.out.println("   _____");
		System.out.println("  |     |");
		System.out.println("  | CAT |");
		System.out.println("  |     |");
		System.out.println("  |_____|");
		System.out.println();
		System.out.println("To bad, you lost your " + currentPlayer.getnumberOfCards() + " cards!");
	}

	void birdsNr(Cards card)
	{
		System.out.println("   _____");
		System.out.println("  |     |");
		System.out.println("  | BIRD|");
		System.out.println("  |  " + card.birdNR + "  |");
		System.out.println("  |_____|");
	}

	void scareCrow()
	{
		System.out.println("   _____");
		System.out.println("  |     |");
		System.out.println("  |SCARE|");
		System.out.println("  |CROW |");
		System.out.println("  |_____|");
	}

}
