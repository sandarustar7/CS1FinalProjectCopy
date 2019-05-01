
public class Elf extends DefaultRace
{
	final String[] namesArray = {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", 
			"Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias",
			"Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis", "Adrie", "Althaea", 
			"Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", 
			"Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", 
			"Shanirra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"};
	final String[] traitsArray = {"Fey Ancestry: You have advantage on saving throws " + 
			"against being charmed, and magic can’t put you to sleep.", "Trance: Elves don’t need to sleep. Instead, they " + 
					"meditate deeply, remaining semiconscious, for 4 " + 
					"hours a day. (The Common word for such meditation " + 
					"is\n        “trance.”) While meditating, you can dream after a " + 
					"fashion; such dreams are actually mental exercises that " + 
					"have become reflexive through years of\n        practice. After " + 
					"resting in this way, you gain the same benefit that a " + 
					"human does from 8 hours of sleep."};
	final String[] languagesArray = {"Common", "Elvish", "another language of your choice if you are a High Elf"};
	final String[] subracesArray = {"High Elf: Intelligence increases by 1. Cantrip: You know one cantrip of your choice from " + 
			"the wizard spell list. Intelligence is your spellcasting " + 
			"ability for it.", "Wood Elf: Wisdom increases by 1. Mask of the Wild: You can attempt to hide even when " + 
					"you are only lightly obscured by foliage, heavy rain, " + 
					"falling snow, mist, and other natural phenomena.", "Drow: Charisma increases by 1. Sunlight Sensitivity: You have disadvantage on attack " + 
							"rolls and on Wisdom (Perception) checks that rely on " + 
							"sight when you, the target o f your attack, or whatever " + 
							"you are trying to perceive is in direct sunlight. Drow Magic: You know the dancing lights cantrip. " + 
							"When you reach 3rd level, you can cast the faerie fire " + 
							"spell once per day. When you reach 5th level, you can " + 
							"also cast the darkness spell once per day. Charisma is " + 
							"your spellcasting ability for these spells."};

	final String[] proficienciesArray = {"Perception", "Shortsword", "Longsword, Longbow, and Shortbow if you are a High Elf or a Wood Elf", "Rapiers and Hand Crossbows if you are a Drow"};
	
	public Elf()
	{	
		super.score1 = "Dexterity"; //Based on Ability Score Increase section, there may not be one based on what the traits say
		super.score1Change = 2;
		super.score2 = "None";
		super.score2Change = 0;
		super.alignment = "Chaotic Good"; // Based on alignment trait
		super.speed = "30, or 35 if you are a Wood Elf";
		super.size = "medium";
		super.vision = "darkvision up to 60 feet, or if you are a Drow darkvision up to 120";
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
