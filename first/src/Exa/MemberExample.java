package Exa;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;
public class MemberExample {
	
		public static void main(String[] args) {
			Map<Member, Integer> map = new HashMap<>();
			map.put(new Member("홍길동",10), 90);
			System.out.println(map.get(new Member("홍길동",10)));
			
			
//			Map<String, Integer> map = new HashMap<>();
//			map.put("홍길동", 50);
//			System.out.println(map.get("홍길동"));
			
			
		}
}
