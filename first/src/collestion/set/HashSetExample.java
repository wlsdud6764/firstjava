package collestion.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Member {
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		System.out.println(name.hashCode()+age);
		return name.length();
	}
	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		return (name.length()==member.name.length());
	}
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> mSet = new HashSet<>();
		mSet.add(new Member("hong21ccc", 10));
		mSet.add(new Member("hongabc", 50));
		System.out.println(mSet.size());
		
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Oracle");
		set.add("Java");
		set.add("JDBC");
		System.out.println(set.size());
		System.out.println("========");
		for(String str : set) {
			System.out.println(str);
		}
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
