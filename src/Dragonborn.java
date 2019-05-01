
public class Dragonborn extends DefaultRace
{

	final String[] namesArray = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Heskan", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun","Torinn"};
	final String[] traitsArray = {"Draconic Ancestry: You have draconic ancestry. " + //Will need to add an exception to show the table in main code.
			"Choose one type of dragon from the Draconic Ancestry " + 
			"table. Your breath weapon and damage resistance are " + 
			"determined by the dragon type, as shown in the table.", "Breath Weapon: You can use your action to exhale " + 
					"destructive energy. Your draconic ancestry determines " + 
					"the size, shape, and damage type of the exhalation. " + 
					"When you use your breath w eapon, each creature in " + 
					"the area o f the exhalation must make a saving throw, " + 
					"the type o f which is determined by your draconic " + 
					"ancestry. The DC for this saving throw equals 8 + " + 
					"your Constitution modifier + your proficiency bonus. " + 
					"creature takes 2d6 damage on a failed save, and half " + 
					"as much damage on a successful one. The damage " + 
					"increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 " + 
					"at 16th level. " + 
					"After you use your breath weapon, you can’t use it " + 
					"again until you complete a short or long rest.", "Damage Resistance: You have resistance to the " + 
							"damage type associated with your draconic ancestry."};
	final String[] languagesArray  = {"Common", "Draconic"};
	final String[] subracesArray = {"None"};
	final String[] proficienciesArray = {"None"};
	
	
	public Dragonborn()
	{
		super.score1 = "Strength";
		super.score1Change = 2;
		super.score2 = "Charisma";
		super.score2Change = 1;
		super.alignment = "Good or Evil";
		super.speed = "30";
		super.size = "medium";
		super.vision = "N/A";
		
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
