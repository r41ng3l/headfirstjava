class Primos {
	public static void main(String[] args) {

		//Create array
		int i = 1;
		while (i <= 1000000) {
			if (isPrime(i)) {
				int j = i;
				System.out.print(i);
				while(true) {
					if ((Integer.toString(Primos.cypherSum(j))).length() == 1) {
						System.out.println(" ----> " + Primos.cypherSum(j));
						break;
					} else {
						j = Primos.cypherSum(j);
						if (isPrime(j)) {
							System.out.print(" ----> " + j);
						}
					}
				}	
			}
			i++;
		}
	}

	//Método para saber si un número dado es primo
	static boolean isPrime(int primeTest) {
		if (
		(primeTest % 2 != 0 && 
		primeTest % 3 != 0 &&
		primeTest % 4 != 0 &&
		primeTest % 5 != 0 &&
		primeTest % 6 != 0 &&
		primeTest % 7 != 0 &&
		primeTest % 8 != 0 &&
		primeTest % 9 != 0)|| 
		primeTest == 1 ||
		primeTest == 2 ||
		primeTest == 3 ||
		primeTest == 5 ||
		primeTest == 7
		) {
			return true;
		} else {
			return false;
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
			k++;
		}
		return primeSum;
	}
}
