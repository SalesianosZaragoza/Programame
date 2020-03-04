
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2018D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		procesarScanner(sc);
		recorrerLineas();
	}

	private static ArrayList<String> lineas;
	
	
	private static void procesarScanner(Scanner scanner) {
		ArrayList<String> list=new ArrayList<String>();
		while(scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		System.out.println(list);
		
	}
	
	private static void recorrerLineas() {
		for (int i = 0; i < lineas.size();) {
			String linea = lineas.get(i);
			int casosDePrueba = leerNumeroDeCasosDePrueba(linea);
			for (int j = 1; j < casosDePrueba; j++) {
				procesarCaso(lineas.get(i+j));
			}
			i=casosDePrueba+i++;
		}

	}

	private static void procesarCaso(String tautologia) {
		String[] XesY = tautologia.split("es");
		if(XesY[0].toLowerCase().trim()
				.equals(
						XesY[1].toLowerCase().trim())) 
		{
			System.out.println("TAUTOLOGIA");
		}else {
			System.out.println("NO TAUTOLOGIA");
		}
	}

	private static int leerNumeroDeCasosDePrueba(String linea) {
		return Integer.parseInt(linea);
		
	}

}