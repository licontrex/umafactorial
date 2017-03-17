import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

	public static BigInteger fact(BigInteger num) {
		if (num.compareTo(BigInteger.ONE)<=0) {
			return BigInteger.ONE;
		} else {
			return num.multiply(fact(num.subtract(BigInteger.ONE)));
		}
	}

<<<<<<< HEAD
	public static void main(String []args) {
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		BigInteger num = BigInteger.valueOf(scanInput.nextLong());

		if (num.compareTo(BigInteger.ZERO)<0) {
			System.out.println("El factorial no esta definido"
                         + " para numeros negativos");
		} else {
			BigInteger fac = fact(num);

			System.out.println("El factorial de "+num+" es "+fac);
		}

		scanInput.close();
	}

}
=======
		public static long getNumber() {
			Scanner scanInput = new Scanner(System.in);
			System.out.print("Introduzca un numero: ");
			long num = scanInput.nextLong();
			scanInput.close();
			return num;
		}

		public static void showFac(long num) {
				if (num<0) {
					System.out.println("El factorial no esta definido" +
		" para numeros negativos");
				} else {
					long fac = fact(num);

					System.out.println("El factorial de "+num+" es "+fac);
				}
			}

			public static void main(String []args) {
				long num = getNumber();

				showFac(num);
			}
<<<<<<< HEAD
		}
>>>>>>> 90a6b07... refactorizacion de metodo de entrada
=======
>>>>>>> bb1937b... refactorizacion de metodo de salida
