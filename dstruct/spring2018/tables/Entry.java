package tables;

public class Entry<K,V> {

	private K key;
	private V value;
	
	
	
	public Entry(K key, V value) {
		this.key= key;
		this.value = value;
	}

	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	
	public K getKey() {
		return key;
	}
	
	
	public boolean equals(Entry<K,V> item){
		// TODO check for null;
		return this.key.equals(item.getKey());
	}
	
	
}
