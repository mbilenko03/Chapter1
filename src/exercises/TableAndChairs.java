package exercises;

public class TableAndChairs {

	public static void main(String[] args) {
		// This is my chair
		System.out.println("Here is a chair:");
		for(int i = 1; i<=14; i++) 
		{
			if (i <= 7)
				System.out.println("C");
			
			if (i == 8)
				System.out.println("CCCCCCCCCCCCCCC");
		
			if (i >= 9)
				System.out.println("C             C");
		}
		
		//Space between chair and table
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("Here is a table:");
		// This is my table
		for (int i = 1; i<=10; i++) 
		{
			if (i == 1)
				System.out.println("TTTTTTTTTTTTTTTTTTTTTTT");
			
			if (i >= 2)
				System.out.println("T                     T");
		}
}

}
