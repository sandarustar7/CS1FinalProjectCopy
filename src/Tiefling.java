
public class Tiefling extends DefaultRace
{
	final String[] namesArray = {"Akmenos", "Amnon", "Barakas",
			"Damakos", "Ekemon", "Iados", "Kairon", "Leucis", "Melech", 
			"Mordai", "Morthos", "Pelaios", "Skamos", "Therai", "Akta", "Anakis", "Bryseis", "Criella",
					"Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", 
					"Orianna", "Phelaia", "Rieta"};
	final String[] traitsArray = {"Hellish Resistance: You have resistance" + 
			"to fire damage.", "Infernal Legacy: You know the thaumaturgy cantrip." + 
					"Once you reach 3rd level, you can cast the hellish" + 
					"rebuke spell once per day as a 2nd-level spell. Once you" + 
					"reach 5th level, you can also cast the darkness spell" + 
					"once per day. Charisma is your spellcasting ability for" + 
					"these spells."};
	final String[] languagesArray = {"Common", "Infernal"};
	final String[] subracesArray = {"None"};
	final String[] proficienciesArray = {"None"};
	
	public Tiefling()
	{
		super.score1 = "Charisma";
		super.score1Change = 2;
		super.score2 = "Intelligence";
		super.score2Change = 1;
		super.alignment = "Chaotic Evil";
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
