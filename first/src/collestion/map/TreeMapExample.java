package collestion.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new  TreeMap<>();
		map.put(new Integer(87), "홍길동");
		map.put(new Integer(80), "길동이");
		map.put(new Integer(85), "홍이");
		map.put(new Integer(90), "동동이");
		map.put(new Integer(95), "길이");
		Set<Integer>set = map.keySet();
		for(Integer intValue : set) {
			System.out.println(intValue + " "  + map.get(intValue));
		}
		NavigableMap<Integer, String> desMap = map.descendingMap();
		Set<Integer> keySet = desMap.keySet();
		for(Integer ivalue : keySet) {
			System.out.println(ivalue);
		}
		
		Map.Entry<Integer, String> entry = null;
		entry = map.firstEntry();//가장작은값을 가지고 올때
		System.out.println( entry.getKey() + " , " + entry.getValue());
		entry = map.lastEntry();
		System.out.println( entry.getKey() + " , " + entry.getValue());
		entry = map.lowerEntry(new Integer(95));//기준값보다 작은 값
		System.out.println( entry.getKey() + " , " + entry.getValue());
		entry = map.higherEntry(new Integer(90));//기준값보다 큰 값
		System.out.println( entry.getKey() + " , " + entry.getValue());
		while (!map.isEmpty()) {
			entry = map.pollFirstEntry();
			System.out.println(entry.getKey() + "," + entry.getValue() + " , " + map.size());
			
			
		}
	} 

}
