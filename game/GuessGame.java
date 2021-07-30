class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	int guessNum;

	void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		while (true) {
			guessNum = (int) (Math.random() * 10);
			int[] pNum = {p1.guess(),p2.guess(),p3.guess()};
			System.out.println("-------------------------");
			System.out.println("The secret number is " + guessNum);
			System.out.println("-------------------------");
			System.out.println("Player 1 says " + pNum[0]);
			System.out.println("Player 2 says " + pNum[1]);
			System.out.println("Player 3 says " + pNum[2]);
			System.out.println("-------------------------");
			if (pNum[0] == guessNum | pNum[1] == guessNum | pNum[2] == guessNum) {
				int x = 0;
				while (x < 3) {
					if (pNum[x] == guessNum) {
						System.out.println("We have a winner here! Congratulations Player " + (x + 1));
					}
					x++;
				}
				break;
			} else {
				System.out.println("We don't have any winner... Let's try again!");
			}
		}
	}
}

class Player {
	int number;

	int guess() {
		number = (int) (Math.random() * 10);
		return number;
	}
}

class GameLauncher {
	public static void main(String[] args) {
		GuessGame g = new GuessGame();
		g.startGame();
	}
}
