import java.util.Scanner;
//Spencer Sexton and Sandaru Fernando
public class Driver
{
	public static Scanner input;

	public static void main( String[ ] args )
	{
		input = new Scanner(System.in);
		int choice;
		
		System.out.println ( "Hello there and welcome to the unnoficial Dungeons and Dragons character generator!" );
		System.out.println ( "Please follow along with the default character sheet and fill in the boxes as we go along." );
		
		//Step 1: Choose a race
		System.out.println ( "What race would you like to be? Enter the number next to your choice." );
		System.out.println( "Elf:1 Dwarf:2  Halfling:3  Human:4  Dragonborn:5  Gnome:6  Half-Elf:7  Half-Orc:8  Tiefling:9" );
		choice=input.nextInt();
		DefaultRace character = null;
		switch(choice)
		{
			case 1:character = new Elf(); break;
			case 2:character = new Dwarf(); break;
			case 3:character = new Halfling(); break;
			case 4:character = new Human(); break;
			case 5:character = new Dragonborn(); break;
			case 6:character = new Gnome(); break;
			case 7:character = new HalfElf(); break;
			case 8:character = new HalfOrc(); break;
			case 9:character = new Tiefling(); break;
			default:System.out.println("That wasn't a valid option.");
		}
		System.out.println("Your traits are: ");
		for (String trait: character.getTraits())
		{
			System.out.println(trait);
		}
		
		//Step 2: Choose a class
		//Step 2.5: Choose a level (add this if we have extra time)
		//Step 3: Ability scores (potentially give the option for random rolls or points system)
		//Step 4: Generic stuff, such as name, sex, alignment, and roll for height and weight
		//Step 5: Equipment

	}

}