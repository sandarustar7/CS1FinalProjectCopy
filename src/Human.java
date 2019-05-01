
public class Human extends DefaultRace
{
	final String[] namesArray = {"None"};
	final String[] traitsArray = {"None. You have no specific traits and your abilities are more spread out and average."};
	final String[] languagesArray = {"Common", "another language of your choice"};
	final String[] subracesArray = {"None"};
	final String[] proficienciesArray = {"None"};
	
	public Human()
	{
		super.score1 = "each ability";
		super.score1Change = 1;
		super.score2 = "None";
		super.score2Change = 0;
		super.alignment = "any";
		super.speed = "30";
		super.size = "medium";
		super.vision = "None";
	}
	public String[] getTraits( )
	{
		return traitsArray;
	}
	public String[] getNames( )
	{
		return namesArray;
	}
	public String[] getLanguages( )
	{
		return languagesArray;
	}
	public String[] getSubraces( )
	{
		return subracesArray;
	}
	public String[] getProficiencies( )
	{
		return proficienciesArray;
	}
}
