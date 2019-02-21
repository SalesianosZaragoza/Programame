import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EjercicioD_2018 {

	public static void main(String[] args) {
		
		String linea = "1 2 3 4 5 4 2 3";
		String[] trozos = linea.split(" ");
		List<String> numeros = (List<String>) Arrays.asList(trozos);
		HashSet<String> set = new HashSet<>(numeros);
	}

	private ArrayList<String> lineas;
	
	
	private void procesarScanner(Scanner scanner) {
		ArrayList<String> list=new ArrayList<String>();
		while(scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		System.out.println(list);
		
	}
	
	private void recorrerLineas() {
		for (int i = 0; i < lineas.size();) {
			String linea = lineas.get(i);
			int casosDePrueba = leerNumeroDeCasosDePrueba(linea);
			for (int j = 1; j < casosDePrueba; j++) {
				procesarCaso(lineas.get(i+j));
			}
			i=casosDePrueba+i++;
		}

	}

	private void procesarCaso(String tautologia) {
		String[] XesY = tautologia.split("es");
		if(XesY[0].toLowerCase().trim()
				.equals(
						XesY[1].toLowerCase().trim())) 
		{
			System.out.println("es una tautologia");
		}
	}

	private int leerNumeroDeCasosDePrueba(String linea) {
		return Integer.parseInt(linea);
		
	}

	private void validarLinea(String linea) {
		Double numero = Double.parseDouble("100");
		if(numero < 0 || numero > 10000) {
			throw new RuntimeException("numero no esta entre 0-10000");
		}
		numero = Math.ceil(numero);
	}
	
	
	
	
	
	
    
    
}