class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movie...");
	}
}

class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Love actually";
		one.genre = "Romantic";
		one.rating = 4;

		Movie two = new Movie();
		two.title = "One Piece";
		two.genre = "Action";
		two.rating = 5;

		Movie three = new Movie();
		three.title = "Volver";
		three.genre = "Almodovarian";
		three.rating = 3;

		one.playIt();
		two.playIt();
		three.playIt();
	}
}
