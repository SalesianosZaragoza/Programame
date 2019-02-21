import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EjercicioE_2018 {
	private static ArrayList<String> lineas;
	private static List<Integer> numerosList;

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		procesarScanner(scanner);
		recorrerLineas(lineas);
		int max=getMaxNumber(numerosList);
		numerosList.remove(max);
		int max2=getMaxNumber(numerosList);
		System.out.println(max * max2);
	}

	
	
	private static int getMaxNumber(List<Integer> numerosList2) {
		Integer max = 0;
		for (Integer a : numerosList2) {
			max = Integer.max(a, max);
		}
		return max;
	}



	private static void procesarScanner(Scanner scanner) {
		ArrayList<String> list=new ArrayList<String>();
		while(scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		System.out.println(list);
		
	}
	
	private static void recorrerLineas(List<String> lineas) {
		for (int i = 0; i < lineas.size();) {
			String linea = lineas.get(i);
			int casosDePrueba = leerNumeroDeCasosDePrueba(linea);
			//validar casosDePrueba 
			for (int j = 1; j < casosDePrueba; j++) {
				procesarCaso(lineas.get(i+1),casosDePrueba);
			}
			i=1+i++;
		}

	}

	private static void procesarCaso(String linea, int casosDePrueba) {
		numerosList = new ArrayList<>();
		String[] numeros = linea.split(" ");
		for (int i = 0; i < numeros.length; i++) {
			String valor = numeros[i];
			int numero = Integer.parseInt(valor);
			//validar numero
			numerosList.add(numero);
		}
	}

	private static int leerNumeroDeCasosDePrueba(String linea) {
		return Integer.parseInt(linea);
		
	}


	
	
	
	
	
    
    
}