
public class HalfOrc extends DefaultRace
{
	final String namesArray[] = {"Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", 
			"Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk", "Baggi", "Emen", "Engong", "Kansif",
			"Myev", "Neega", "Ovak", "Ownka", "Shautha", "Sutha", "Vola",
			"Volen", "Yevelda"};
	final String[] traitsArray = {"Relentless Endurance: When you are reduced to " + 
			"0 hit points but not k illed outright, you can drop to 1 hit " + 
			"point instead. You can’t use this feature again until you " + 
			"finish a long rest.", "Savage Attacks: When you score a critical hit with " + 
					"a melee weapon attack, you can roll one of the weapon’s " + 
					"damage dice one additional time and add it to the extra " + 
					"damage o f the critical hit."};
	final String[] languagesArray = {"Common", "Orc"};
	final String[] subracesArray = {"None"};
	final String[] proficienciesArray = {"Intimidation"};
	
	public HalfOrc()
	{
		super.score1 = "Strength";
		super.score1Change = 2;
		super.score2 = "Constitution";
		super.score2Change = 1;
		super.alignment = "Chaotic, usually not Good";
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
