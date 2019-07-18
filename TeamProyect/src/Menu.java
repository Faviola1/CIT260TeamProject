import java.util.*;
public class Menu {
	
public Menu() {}

public int PrincipalMenu() {

	System.out.print("	**** MOVIES ****\n\n"
			+ "1. Register Movie\n"
			+ "2. Search Movie\n"
			+ "3. Exit\n");

	int op=Validate(1,3);
	
	return op;
	
	}

public int SelectMovieMenu() {

	System.out.print("	**** MOVIES ****\n\n"
			+ "1. Comedy\n"
			+ "2. Animated\n"
			+ "3. Drama\n"
			+ "4. Sport\n"
			+ "5. Mystery\n"
			+ "6. Adventure\n");
	
	int op=Validate(1,6);
	
	return op;
	
	}

public  int Validate(int x, int y)
{
	int index = 0;
	boolean repeat = true;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the option between " +x+ " and "+y+ " : ");
	do {
		
		try {
			index = input.nextInt();
			repeat = false;
			if ((index < x) || (index > y)) {
				System.out.print("Enter the option between " +x+ " and "+y+ " : ");
				repeat = true;
			}
		}
			catch(Exception e) {
			input.nextLine();
			System.out.println("It is not a valid number");
			System.out.print("Enter the option between " +x+ " and "+y+ " : ");
		}
	} while(repeat);
	
	return(index);
}

}
	
	
