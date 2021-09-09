import java.util.*;

class Primos {
	public static void main(String[] args) {

		//Create array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start number");
		long i = scanner.nextInt();
		System.out.println("Enter end number");
		long x = scanner.nextInt();
		while (i <= x) {
			if (isPrime(i)) {
				long j = i;
				System.out.print(i);
				while(true) {
					if ((Long.toString(Primos.cypherSum(j))).length() == 1) {
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
	static boolean isPrime(long primeTest) {
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
	static long cypherSum (long prime) {
		String primeStr = new String();
		primeStr = Long.toString(prime);
		long primeSum = 0;                                                     	
                long k = 0;
		while (k < primeStr.length()) {
	               	primeSum = Character.getNumericValue(primeStr.charAt(k)) + primeSum;
			k++;
		}
		return primeSum;
	}
}
