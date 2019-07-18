import java.io.File;
import java.util.*;
public class finalProyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		do {
		Menu menu=new Menu();
		op=menu.PrincipalMenu();
		
		switch(op)
		{
			case 1:
				System.out.print("Llamar al metodo Crear pelicula");
			break;
			case 2:
			 {
			  int index=menu.SelectMovieMenu();
			  switch(index)
				{
					case 1:
					{
						ComedyMovie comedy=new ComedyMovie();
						//llamar al metodo llenar Peli
					}break;
				}
			  }
			 
			 break;
			 
		}
		}while(op!=0);

	}
	
	/*public static int Validate(int x, int y)
	{
		int index = 0;
		boolean repeat = true;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter the number of the genre between +x+ and +y+: ");
			try {
				index = input.nextInt();
				repeat = false;
				if ((index < x) || (index > y)) {
					System.out.println("Enter a number between +x+ and +y+: ");
					repeat = true;
				}
			}
				catch(Exception e) {
				input.nextLine();
				System.out.println("It is not a valid number");
			}
		} while(repeat);
		
		return(index);
	}*/

}