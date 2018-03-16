package abcd;

import java.util.EnumSet;

public class Enum_tom1 {
	public static void main(String[] args)
	{
		for(Enum_jerry1 anime:Enum_jerry1.values())
		{
			System.out.printf(anime+" has rating of %f, Anime is %s and pretty %s",
					        anime.getRating(),anime.getGenre(),anime.getFeel());
			
			System.out.println("");
		}
		
		System.out.println("********************************"
				+ "********************************************");
		System.out.println("********************************"
				+ "********************************************");
		System.out.println("");
		System.out.println("Now we will print on the basis of range");
		
		for(Enum_jerry1 anime:EnumSet.range(Enum_jerry1.Code_Geass, Enum_jerry1.Gundam_00))
		{
			System.out.printf(anime+" has rating of %f, Anime is %s and pretty %s",
			        anime.getRating(),anime.getGenre(),anime.getFeel());
			
			System.out.println("");
		}
	}
}
