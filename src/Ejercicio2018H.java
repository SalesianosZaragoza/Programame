
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2018H {
	private static ArrayList<String> lineas;
	private static List<Integer> numerosList;
	
private static ArrayList<String> lineasDummy;
	
	static{
		lineasDummy = new ArrayList<>();
		lineasDummy.add("4");
		lineasDummy.add("90 91");
		lineasDummy.add("0 180");
		lineasDummy.add("120 700");
		lineasDummy.add("90 270");
	}
	
	public static void main(String[] args) {
		
//		Scanner scanner =new Scanner(System.in);
//		procesarScanner(scanner);
//		recorrerLineas(lineas);
//	}
	
		recorrerLineas(lineasDummy);
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
			for (int j = 0; j < casosDePrueba; j++) {
				procesarCaso(lineas.get(i+1+j),casosDePrueba);
			}
			i=1+i+casosDePrueba;
		}

	}
	
	private static int leerNumeroDeCasosDePrueba(String linea) {
		return Integer.parseInt(linea);
		
	}  
	
	private static void procesarCaso(String linea, int casosDePrueba) {
		numerosList = new ArrayList<>();
		String[] numeros = linea.split(" ");
		int[] numerosInt = new int[2];
		for (int i = 0; i < numeros.length; i++) {
			String valor = numeros[i];
			int numero = Integer.parseInt(valor);
			numerosInt[i]= numero;
		}
		
		int resultadoNormal =Math.abs(numerosInt[0] -numerosInt[1]);
		int resultadoreverse = Math.abs((360+numerosInt[0]) -numerosInt[1]);
		if(resultadoNormal < resultadoreverse) {
			System.out.println("ASCENDENTE");
		}else if(resultadoreverse < resultadoNormal) {
			System.out.println("DESCENDENTE");
		}else {
			System.out.println("DA IGUAL");
		}
	}
}