package Programame;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Problema1 {

	public static void main(String[] args) {
		//InputStream in = System.in;
		int num_apuestas = 0;
		String entrada = "3\n"
						+ "x-3-2\n"
						+ "1-3-0\n"
						+ "2-2-5";

		InputStream in = new ByteArrayInputStream(entrada.getBytes());
		Scanner sc = new Scanner(in);
		if (sc.hasNextInt()) {
			num_apuestas = sc.nextInt();
			System.out.println(num_apuestas);
		}
		if (sc.hasNextLine()) {

			System.out.println("retorno carro:" + sc.nextLine());
			System.out.println("apuesta:" + sc.nextLine());
			System.out.println("nosequehadespues:" + sc.nextLine());
		}
		recorrer();
	}

	static private void recorrer() {
		String nombre = "felipe, juan, agustin, juan";
		String[] split = nombre.split(", ");
		List<String> lista = Arrays.asList(split);
		int indexToDelete = 0;
		List<String> lista2 = Collections.emptyList();

		Set<String> hashSet = new HashSet(lista);
		hashSet.addAll(lista2);

		List<String> subList = lista.subList(0, lista.indexOf("felipe"));
		Collections.frequency(subList, subList);

		hashSet.add("juan");

		HashMap<String, String> map = new HashMap<>();
		String object = map.get("543");


		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (string.equals("juan")) {
				iterator.remove();
			}
		}
		System.out.println(lista);

//		for (String string : lista) {
//			if (string.equals("juan")) {
//				indexToDelete = lista.indexOf(string);
//				break;
//			}
//		}
//		lista.remove(indexToDelete);

		Collections.sort(lista);
		System.out.println(lista);
		Collections.reverse(lista);
		System.out.println(lista);

		lista2.addAll(lista);
		lista2.stream().filter((name) -> (name.length() < 20));
		lista.removeIf((name) -> (name.length() > 20));
		
		lista2 = lista.stream()
				.collect(
						Collectors.filtering(
								n -> (n.length() < 20), 
								Collectors.toList()));

	}

}
