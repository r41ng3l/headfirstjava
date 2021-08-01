class Books {
	String title;
	String author;
}

class BooksTestDrive {
	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		int x = 0;
		
		while (x < 3) {
			myBooks[x] = new Books();
			if (x == 0) {
				myBooks[x].title = "The Grapes of Java";
				myBooks[x].author = "bob";
			} else if (x == 1) {
				myBooks[x].title = "The Java Gatsby";
		 		myBooks[x].author = "sue";
			} else if (x == 2){
				myBooks[x].title = "The Java Cookbook";
		 		myBooks[x].author = "ian";
			}
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}

	}	
}
