package com.vector.classprograms;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

record Player(Integer id, String name, Double basePrice)
{
	
}

class IPLTeam
{
	private String teamName;
	private List<Player> listOfPlayers;
	
	public IPLTeam(String teamName)
	{
		 this.teamName=teamName;
		 listOfPlayers=new Vector<Player>();
	}
	public void addPlayer(Player player)
	{
		listOfPlayers.add(player);
	}
	public void displayListOfPlayers()
	{
		System.out.println("List of Players in "+teamName+" team :");
		listOfPlayers.forEach(System.out::println);
	}
	public void removePlayerBasedOnPrice()
	{
		Iterator<Player> iterator=listOfPlayers.iterator();
		
		while(iterator.hasNext())
		{
			Player player=iterator.next();
			
			if(player.basePrice()>5000)
				iterator.remove();
		}
	}
}

public class VectorDemo7 
{

	public static void main(String[] args) 
	{
		
		IPLTeam team = new IPLTeam("CSK");
		
		team.addPlayer(new Player(07, "MS.Dhoni", 90000d));
		team.addPlayer(new Player(01, "Ruturaj Gaikwad", 7000d));
		team.addPlayer(new Player(02, "Convey", 6500d));
		team.addPlayer(new Player(02, "Dube", 900d));
		
		team.displayListOfPlayers();
		System.out.println("-------------------");
		team.removePlayerBasedOnPrice();
		System.out.println("After removing player based on the price: ");
		team.displayListOfPlayers();

	}

}
