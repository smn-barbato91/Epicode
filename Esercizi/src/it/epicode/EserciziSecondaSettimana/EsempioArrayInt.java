package it.epicode.EserciziSecondaSettimana;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EsempioArrayInt {

	public static void main(String[] args) {

		int[] n = { 19, 89, 24, 1, 19, 89, 36, 2, 47, 1, 24, 24, 24, 89, 89, 89 };

		Map<Integer, Integer> map = stampaFrequenza(n);
		
		//System.out.println(map);
		
		stampa(map);

	}

	private static void stampa(Map<Integer, Integer> map) {
		Map<Integer, Integer> inputMap = map;
		Set<Integer> key = inputMap.keySet();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.addAll(key);
		int lastKey = treeSet.last();
		System.out.println("Numero apparso più volte "+ inputMap.get(lastKey));
		
	}

	public static Map<Integer, Integer> stampaFrequenza(int[] arr) {
		int[] inputArray = arr;
		System.out.println("#####-User input-#####");
		System.out.println(Arrays.toString(arr));

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			int key = 0;

			for (int j = 0; j < inputArray.length; j++) {

				if (inputArray[i] == inputArray[j]) {
					key++;

				}
			}
			if (key > 1)
				map.put(key, inputArray[i]);
		}
		return map;

	}

}
