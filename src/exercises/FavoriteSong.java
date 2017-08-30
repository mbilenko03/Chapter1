package exercises;

public class FavoriteSong {

	public static void main(String[] args) {
		//Song Info
		System.out.println("We Won't Be Alone by Feint");
		
		//Space between info and lyrics
				System.out.println("");
		
		//Array of song lyrics
		String[] songLyrics = new String[10];
		songLyrics[0] = "You paint a picture in my mind";
		songLyrics[1] = "You want to leave it all behind";
		songLyrics[2] = "In a world thats turning all the time";
		songLyrics[3] = "Nothing could stop me longing for your eyes";
		songLyrics[4] = "I won't let it die";
		songLyrics[5] = "I can feel you when you're not around";
		songLyrics[6] = "When the night gets cold";
		songLyrics[7] = "I won't";
		songLyrics[8] = "Be alone";
		songLyrics[9] = "We won't be alone";

		//loop to print song lyrics
		for (int i = 0; i < 9; i++)
		{
			System.out.println(songLyrics[i]);
		}
	}

}
