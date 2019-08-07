package api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 50);
		map.put("이순신", 60);
		map.put("김유신", 70);
		map.put("이순신", 80);
		System.out.println("값: " + map.get("홍길동"));
		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println(str + "," + map.get(str));
		}
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + ", " + map.get(str));
		}
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> m : entrySet) {
			System.out.println("forEntry: " + m.getKey() + ", " + m.getValue());
		}
		Iterator<Map.Entry<String, Integer>> itra = entrySet.iterator();
		while (itra.hasNext()) {
			Map.Entry<String, Integer> ent = itra.next();
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}
	}
}
