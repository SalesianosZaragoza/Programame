package Programame;

import java.util.HashMap;
import java.util.List;

public class Problema2 {

	static HashMap<Integer, List<Integer>> map 
			= new HashMap<>();
	private static List<Integer> list;
	{
		map.put(1, List.of(2, 3, 5, 7));
		map.put(2, List.of(2, 3, 4, 7));
		map.put(3, List.of(2, 3, 5, 7));
		map.put(4, List.of(2, 3, 5, 7));

	}

	public static void main(String[] args) {
		int num =0;
		
		list = map.get(num);
			
		
	}

}
