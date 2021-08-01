public class phraseomatic {
	public static void main (String[] args) {
		String[] wordList1 = {"customer","sentence","end-to-end","Multi-Tier","30.000 kiloton","Super-Automated","charismatic","velvet"};
		String[] wordList2 = {"oriented","sticky","global","written","targeted","shared","wet","free","clustered","branded","centric"};
		String[] wordList3 = {"service","plan","store","campaing","liberalisation","compromise","agreement","portal","space","vision"};
		int length1 = wordList1.length;
		int length2 = wordList2.length;
		int length3 = wordList3.length;
		int rand1 = (int) (Math.random() * length1);
		int rand2 = (int) (Math.random() * length2);
		int rand3 = (int) (Math.random() * length3);
		String word1 = wordList1[rand1];
		String word2 = wordList2[rand2];
		String word3 = wordList3[rand3];
		System.out.println("What we need is a " + word1 + " " + word2 + " " + word3);
	}
}
