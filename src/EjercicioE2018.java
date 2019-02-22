import java.util.Random;

public class EjercicioE2018 {

	public static void main(String[] args) {
		int numElementos = numElementos();
		int elementos[] = new int[numElementos];
		int maximo = 0;
		numeros(elementos);
		maximo = multiplicacion(elementos);

		System.out.printf("Num elementos %d\nNum maximo %d", elementos.length, maximo);
	}

	private static int multiplicacion(int[] elementos) {
		int maximo = 0;
		int numMayor = 0;

		for (int i = 0; i < elementos.length - 1; i++) {
			if (elementos[i] > numMayor) {
				numMayor = elementos[i];
			}
			if (numMayor * elementos[i + 1] > maximo) {
				maximo = numMayor * elementos[i + 1];
			}
		}
		return maximo;
	}

	private static int numElementos() {
		Random random = new Random();
		int num = random.nextInt(200000);

		while (num < 2) {
			num = random.nextInt(200000);
		}

		return num;
	}

	private static void numeros(int elementos[]) {
		Random random = new Random();

		for (int i = 0; i < elementos.length - 1; i++) {
			// elementos[i] = random.nextInt(10); // no mayor a 10^9 en valor absoluto
			elementos[i] = random.nextInt((int) Math.pow(10, 9));
			while (Math.abs(elementos[i]) > (int) Math.pow(10, 9)) {
				elementos[i] = random.nextInt((int) Math.pow(10, 9));
			}
		}
	}
}
