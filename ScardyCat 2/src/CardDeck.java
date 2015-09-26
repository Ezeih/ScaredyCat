public class CardDeck
{
	public Cards[] cardDeck;

	CardDeck()
	{
		cardDeck = makeDeck();
	}

	public Cards[] makeDeck()
	{
		Cards[] deck = new Cards[49];

		// make cards 1-5 birds(7 per type)
		for (int birdNR = 1; birdNR < 6; birdNR++)
		{
			for (int cardsPerType = 0; cardsPerType < 7; cardsPerType++)
			{
				int arrayElement = ((birdNR - 1) * 7) + cardsPerType;
				Cards card = new Bird(birdNR);
				deck[arrayElement] = card;
				// System.out.println(card.birdNR);

			}

		}
		// make 5 cards with 6 birds
		for (int CardsPerType = 0; CardsPerType < 5; CardsPerType++)
		{
			Cards card = new Bird(6);
			deck[35 + CardsPerType] = card;

		}

		// make 6 scarecrowCards
		for (int CardsPerType = 0; CardsPerType < 6; CardsPerType++)
		{
			Cards card = new ScareCrow(0);
			deck[40 + CardsPerType] = card;

		}

		// make 3 cats
		for (int CardsPerType = 0; CardsPerType < 3; CardsPerType++)
		{
			Cards card = new Cat(1);
			deck[46 + CardsPerType] = card;

		}
		return deck;
	}

	Cards getNextCard()
	{
		int randomNR = (int) Math.ceil(Math.random() * (cardDeck.length - 1));
		Cards nextCard = cardDeck[randomNR];
		updateDeck(nextCard);
		return nextCard;
	}

	void updateDeck(Cards nextCard)
	{
		Cards[] newDeck = new Cards[cardDeck.length - 1];
		int k = 0;
		for (int i = 0; i < cardDeck.length; i++)
		{

			if (cardDeck[i] != nextCard)
			{
				newDeck[k] = cardDeck[i];
				k += 1;
			}
		
		}
		cardDeck = newDeck;
	}
	void addCards(Cards[]playerCards){
		
		Cards[] tempArr = new Cards[cardDeck.length + playerCards.length];

		for(int i=0; i<cardDeck.length; i++){
		tempArr[i]= cardDeck[i]; 
		}
		for(int i=0; i<playerCards.length; i++){
		tempArr[i + cardDeck.length]= playerCards[i]; 
		}
		playerCards = tempArr;
	
	}

}
