package java_Practice;

import java.util.HashMap;

public class CharecterCountOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "automationtesting";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
