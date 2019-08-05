package generic;
class Pair<K,V>{//안에는 대문자면 아무거나 가능
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class PriductExample {
	public static void main(String[] args) {
		Pair<Integer,String> pair = new Pair<> (10,"bok");
		Integer retInt = pair.getKey();
		String retStr = pair.getValue();
	}
	

}
