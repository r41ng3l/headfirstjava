public class beerbottles {

	public static void main (String[] args) {

		int bottles = 99;
		String bottlePlural = " bottles of beer are left";
		String bottleSingular = " bottle of beer is left";
		String bottleNull = "No more beer";
		while (bottles >= 0) {

			if (bottles == 1) {

				System.out.println(bottles + bottleSingular);

			} else if (bottles == 0) {

				System.out.println(bottleNull);

			} else {

				System.out.println(bottles + bottlePlural);

			}

			bottles--;

		}

	}

}
