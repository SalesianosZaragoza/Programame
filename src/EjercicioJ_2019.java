import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EjercicioJ_2019 {
	private static ArrayList<String> lineas;
	private static int altura;
	private static int anchura;
	private static byte[][] graph;
	
	private static ArrayList<String> lineasDummy;
	
	static{
		lineasDummy = new ArrayList<>();
		lineasDummy.add("IISSBSIIIII");
		lineasDummy.add("SISSBIB");
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (sc.hasNext()) {
//			String string = (String) sc.nextLine();
//			lineas.add(string);
//		}
		procesarLineas(lineasDummy);
	}

	
	
	private static void procesarLineas(ArrayList<String> lineas) {
		for (String linea : lineas) {
			procesarGrafica(linea);
		}
	}



	private static void procesarGrafica(String linea) {
		anchura = linea.length();
		altura  = linea.length() - linea.replace("/", "").length();
		graph = new byte[altura][anchura+2];
		drawFirstLine();
		drawGraph(linea);
		drawLastLine();
	}



	private static void drawGraph(String linea) {
		int posicionPintado=altura; 
		for (int i = 0; i < altura; i++) {
			graph[i][0]='#';
			graph[i][anchura+2]='#';
		}
		for (int i = 1; i < anchura+2; i++) {
			if(posicionPintado<0)throw new RuntimeException("no puedo pintar debajo de cero");
			posicionPintado-=drawGraph(graph[posicionPintado][i],linea.charAt(i));
		}
		System.out.println(graph);
	}



	private static int drawGraph(byte where, char icon) {
		int nivel = 0;
		switch(icon) {
			case 'S':
				where = '/';
				nivel=+1;
				break;
			case 'B':
				where = '\\';
				nivel=-1;
				break;
			case 'I':
				where = '_'; 
				break;
		}
		return nivel;
	}



	private static void drawLastLine() {
		char[] c = new char[anchura];
		Arrays.fill(c, '#');
		String beginEnd = new String(c);
		System.out.println(beginEnd);
	}



	private static void drawFirstLine() {
		char[] c = new char[anchura];
		Arrays.fill(c, '#');
		String beginEnd = new String(c);
		System.out.println(beginEnd);
	}



	private void procesarScanner(Scanner scanner) {
		ArrayList<String> list=new ArrayList<String>();
		while(scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		System.out.println(list);
		
	}
	
    
    
}