public class Player
{
	public int age;
	public String name;

	private Cards[] playerCards;
	int numberOfCards;

	Player(String name, int age)
	{
		playerCards = new Cards[0];
		this.name = name;
		this.age = age;

		numberOfCards = 1;
	}

	void addCards(Cards card)
	{
		Cards[] temp = new Cards[playerCards.length + 1];

		if (playerCards.length > 0)
		{

			for (int i = 0; i < playerCards.length; i++)
			{
				temp[i] = playerCards[i];

			}
			temp[playerCards.length] = card;
			playerCards = temp;
		}
		else
		{
			temp[0] = card;
			playerCards = temp;

		}

	}

	void removeCards()
	{
		Cards[] emptyCards = new Cards[0];
		playerCards = emptyCards;
	}

	int getnumberOfCards()
	{
		int number = playerCards.length;
		return number;
	}

	int getNumberOfPoints()
	{
		int number = 0;

		for (int i = 0; i < playerCards.length; i++)
		{
			int temp = playerCards[0].birdNR;
			number += temp;
		}
		return number;
	}
	Cards[] getPlayerCards(){
		return playerCards;
	}
	
}
