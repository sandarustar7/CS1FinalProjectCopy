
public class Halfling extends DefaultRace
{
	final String[] namesArray = {"Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich",
			"Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn",
			"Perrin", "Reed", "Roscoe", "Wellby", "Andry", "Bree", "Callie", "Cora", "Euphemia",
					"Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", 
					"Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"};
	final String[] traitsArray = {"Lucky: When you roll a 1 on an attack roll, ability " + 
			"check, or saving throw, you can reroll the die and must " + 
			"use the new roll.", "Brave: You have advantage on saving throws against " + 
					"being frightened.", "Halfling Nimbleness: You can move through the " + 
							"space of any creature that is of a size larger than yours."};
	final String[] languagesArray = {"Common", "Halfling"};
	final String[] subracesArray = {"Lightfoot Halfling: Charisma increases by 1. Naturally Stealthy: You can attempt to hide even " + 
			"when you are obscured only by a creature that is at least " + 
			"one size larger than you.", "Stout Halfling: Constitution increases by 1. Stout Resilience: You have advantage on saving " + 
					"throws against poison, and you have resistance " + 
					"against poison damage."};
	final String[] proficienciesArray = {"None"};
	
	public Halfling()
	{
		super.score1 = "Dexterity";
		super.score1Change = 2;
		super.score2 = "None";
		super.score2Change = 0;
		super.alignment = "Lawful Good";
		super.speed = "25";
		super.size = "small";
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
