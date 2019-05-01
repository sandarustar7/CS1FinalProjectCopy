
public class HalfElf extends DefaultRace
{
	final String[] namesArray = {"human names or elvish names"};
	final String[] traitsArray = {"Fey Ancestry: You have advantage on saving throws " + 
	"against being charmed, and magic can’t put you to sleep."};
	final String[] languagesArray = {"Common", "Elvish", "one other language of your choice"};
	final String[] subracesArray = {"None"};
	final String[] proficienciesArray = {"two skills of your choice"};
	
	public HalfElf()
	{
		super.score1 = "Charisma";
		super.score1Change = 2;
		super.score2 = "two other abilities of your choice";
		super.score2Change = 1;
		super.alignment = "Chaotic";
		super.speed = "30";
		super.size = "medium";
		super.vision = "darkvision up to 60";
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
