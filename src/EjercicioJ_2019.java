import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EjercicioJ_2019 {
	private static ArrayList<String> lineas;
	private static int altura;
	private static int anchura;
	private static char[][] graph;
	
	private static ArrayList<String> lineasDummy;
	private static int posicionPintado;
	
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
		altura  = linea.length() - linea.replace("S", "").length();
		graph = new char[altura][anchura+2];
		drawFirstLine();
		drawGraph(linea);
		drawLastLine();
	}



	private static void drawGraph(String linea) {
		posicionPintado = altura-1; 
		for (int i = 0; i < altura; i++) {
			graph[i][0]='#';
			graph[i][anchura+1]='#';
		}
		for (int i = 0; i < linea.length()-1; i++) {
			if(posicionPintado<0)posicionPintado=0;
			char charAt = linea.charAt(i);
			graph[posicionPintado][i+1]=drawGraph(charAt);
		}
		for (int i = 0; i < graph.length; i++) {
			System.out.println(graph[i]);
		}
	}



	private static char drawGraph(char icon) {
		char where = 0;
		switch(icon) {
			case 'S':
				posicionPintado-=1;
				where = '/';
				break;
			case 'B':
				posicionPintado+=1;
				where = '\\';
				break;
			case 'I':
				where = '_'; 
				break;
		}
		return where;
	}



	private static void drawLastLine() {
		char[] c = new char[anchura+2];
		Arrays.fill(c, '#');
		String beginEnd = new String(c);
		System.out.println(beginEnd);
	}



	private static void drawFirstLine() {
		char[] c = new char[anchura+2];
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