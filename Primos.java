class Primos {
	public static void main(String[] args) {

		//Create array
		int i = 1;
		while (i <= 1000000) {
			if (
			i % 2 != 0 ||
			i % 3 != 0 ||
			i % 4 != 0 ||
			i % 5 != 0 ||
			i % 6 != 0 ||
			i % 7 != 0 ||
			i % 8 != 0 ||
			i % 9 != 0 ||
			i == 1 ||
			i == 2 ||
			i == 3 ||
			i == 5 ||
			i == 7
			) {
				while(true) {
					if ((Integer.toString(Primos.cypherSum(i))).length() == 1) {
						System.out.println(i + " ----> " + Primos.cypherSum(i));
						break;
					} else {
						i = Primos.cypherSum(i);
					}
				}	
			}
			i++;
		}
	}

	// Método para sumar las cifras de un número e.g: 53 -> 8
	static int cypherSum (int prime) {
		String primeStr = new String();
		primeStr = Integer.toString(prime);
		int primeSum = 0;                                                     	
                int k = 0;
		while (k < primeStr.length()) {
	               	primeSum = Character.getNumericValue(primeStr.charAt(k)) + primeSum;
		}
		return primeSum;
	}
}
