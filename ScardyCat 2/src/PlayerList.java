import java.io.IOException;

public class PlayerList
{
	int playerNumber;
	int counter;
	Player[] playerList;
	Player player;

	PlayerList(int playerNumber) throws Exception
	{
		this.playerNumber = playerNumber;
		makePlayerList(playerNumber);
		counter = 0;

	}

	void makePlayerList(int playerNumber) throws Exception
	{
		// create players add to players Array
		playerList = new Player[playerNumber];
		for (int i = 0; i < playerNumber; i++)
		{
			player = new Player(playerName(), playerAge());
			playerList[i] = player;
		}

		// sort playerArray
		Player[] sortedList = new Player[playerNumber];
		Player[] unsortedList = playerList;

		for (int j = 0; j < playerNumber; j++)
		{
			int tempAge = 1000;
			int k = 0;
			for (int i = 0; i < playerNumber - j; i++)
			{

				if (unsortedList[i].age < tempAge)
				{
					sortedList[j] = unsortedList[i];
					tempAge = unsortedList[i].age;
				}

			}
			for (int i = 0; i < playerNumber; i++)
			{

				if (playerList[i].age > tempAge)
				{
					unsortedList[k] = playerList[i];
					k++;
				}
			}
		}
		playerList = sortedList;
	}

	
	int playerAge() throws Exception
	{
		int age;
		char ch;
		String s = "";

		System.out.println("Enter age");
		ch = (char) System.in.read();
		while (ch != '\n')
		{

			s += ch;
			ch = (char) System.in.read();

		}
		age = Integer.parseInt(s);
		return age;
	}

	
	String playerName() throws Exception
	{
		String name = "";
		char ch;

		System.out.println("Enter name:");
		ch = (char) System.in.read();
		while (ch != '\n')
		{
			name += ch;
			ch = (char) System.in.read();
		}
		return name;
	}

	
	Player getNext()
	{

		if (counter < (playerNumber))
		{
			player = playerList[counter];
			counter += 1;
		}
		else
		{
			counter = 1;
			player = playerList[0];
		}
		return player;
	}

}
