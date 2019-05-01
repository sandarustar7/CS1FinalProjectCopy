
public class Dwarf extends DefaultRace
{
	final String[] namesArray = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal", "Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga","Vistra"};;
	final String[] traitsArray = {"Dwarven Resilience: You have advantage on saving throws against poison, and you have resistance against poison damage.", "Stonecutting: Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and\n              add double your proficiency bonus to the check, instead of your normal proficiency bonus."};
	final String[] languagesArray = {"Common", "Dwarvish"};
	final String[] subracesArray = {"Hill Dwarf: Wisdom increases by 1. Dwarven Toughness: Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.", "Mountain Dwarf: Strength increases by 2. Dwarven Armor Training: You have proficiency with light and medium armor."};
	final String[] proficienciesArray = {"Battleaxe", "Handaxe", "Throwing Hammer", "Warhammer", "One artisan's tool of your choice: Smith's tools, Brewer's supplies, or mason's tools"};
	
	public Dwarf()
	{
		super.score1 = "Constitution";
		super.score1Change = 2;
		super.score2 = "None";
		super.score2Change = 0;
		super.alignment = "Lawful Good";
		super.speed = "25";
		super.size = "small";
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
