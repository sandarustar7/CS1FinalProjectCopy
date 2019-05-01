
public class Gnome extends DefaultRace
{
	final String[] namesArray = {"None"};
	final String[] traitsArray = {"Gnome Cunning: You have advantage on all " + 
			"Intelligence, Wisdom, and Charisma saving throws " + 
			"against magic."};
	final String[] languagesArray = {"Common", "Gnomish"};
	final String[] subracesArray  = {"Forest Gnome: Dexterity increases by 1. Natural Illusionist: You know the minor illusion " + 
			"cantrip. Intelligence is your spellcasting ability for it. Speak with Small Beasts: Through sounds and " + 
			"gestures, you can communicate simple ideas with Small " + 
			"or smaller beasts. Forest gnomes love animals and often " + 
			"keep squirrels, badgers, rabbits, moles, woodpeckers, " + 
			"and other creatures as beloved pets.", "Rock Gnome: Constitution increases by 1. Artificier's Lore: Whenever you make an Intelligence " + 
					"(History) check related to magic items, alchemical " + 
					"objects, or technological devices, you can add twice your " + 
					"proficiency bonus, instead o f any proficiency bonus you " + 
					"normally apply. Tinker: " + 
					"(tinker’s tools). Using those tools, you can spend 1 " + 
					"hour and 10 gp worth of materials to construct a Tiny " + 
					"clockwork device (AC 5, 1 hp). The device ceases " + 
					"to function after 24 hours (unless you spend 1 hour " + 
					"repairing it to keep the device functioning), or when " + 
					"you use your action to dismantle it; at that time, you can " + 
					"reclaim the materials used to create it. You can have up " + 
					"to three such devices active at a time. " + 
					"When you create a device, choose one of the " + 
					"following options:\n" + 
					"Clockwork Toy. This toy is a clockwork animal, monster, " + 
					"or person, such as a frog, mouse, bird, dragon, or " + 
					"soldier. When placed on the ground, the toy moves " + 
					"5 feet across the ground on each of your turns in a " + 
					"random direction. It makes noises as appropriate " + 
					"to the creature it represents.\n" + 
					"Fire Starter. The device produces a miniature " + 
					"flame, which you can use to light a candle, " + 
					"torch, or campfire. Using the device " + 
					"requires your action.\n" + 
					"Music Box. When opened, this music box " + 
					"plays a single song at a moderate volume. " + 
					"The box stops playing when it " + 
					"reaches the song’s end or " + 
					"when it is closed."};
	final String[] proficienciesArray = {"Artisan's Tools"};
	
	public Gnome()
	{
		super.score1 = "Intelligence";
		super.score1Change = 2;
		super.score2 = "None";
		super.score2Change = 0;
		super.alignment = "Good";
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
