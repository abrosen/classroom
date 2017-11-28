package HashTableEvening;

public class HashTable<K,V> {

	public static final double MAX_LOAD_FACTOR = 0.5;
	public static final int INITIAL_SIZE = 11;
	private int size = 0;
	private Entry<K,V>[] table;
	
	public HashTable() {
		size = 0;
		table = new Entry[INITIAL_SIZE];
	}
	
	
	// put
	public void put(K key, V value) {
		int index = key.hashCode() % table.length;
		
		while(table[index] != null ) { // while I don't have an empty slot
			//you have a collision
			if(key.equals(table[index].key)) { 
				break;
			}
			index = index + 1 % table.length;	
		}
		
		table[index] = new Entry<K,V>(key,value);
		
		size++;
		if(1.0*size /table.length  > MAX_LOAD_FACTOR) {
			rehash();
		}
		
	}


	private void rehash() {
		Entry<K,V>[] oldTable = table;
		table = new Entry[table.length*2 + 1];
		size = 0;
		for(int i = 0 ; i < oldTable.length; i++) {
			if(oldTable[i] == null   ||  oldTable[i].key == null) {
				continue;
			}
			
			this.put(oldTable[i].key, oldTable[i].value);
		}
		
	}
	
	// get
	public V get(K key) {
		int index = key.hashCode() % table.length;
		
		while(table[index] != null) {
			if(key.equals(table[index].key)) {
				return table[index].value;
			}
			index = index + 1% table.length;
		}
		
		return null;
		
	}
	
	
	public void delete(K key) {
		int index = key.hashCode() % table.length;
		
		while(table[index] != null) {
			if(key.equals(table[index].key)) {
				table[index].key = null;
				table[index].value = null;
				return;
			}
			index = index + 1 % table.length;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		HashTable<Integer, String> t =  new HashTable<Integer, String>();
		t.put(1, "hi");
		t.put(2, "world");
		t.put(12, "!");
		
		System.out.println(t.get(1));
		System.out.println(t.get(2));
		System.out.println(t.get(12));

		
		for(int i = 1000 ; i>=0; i--) {
			t.put(i, ""+i);
			
		}
		
		for(int i = 0 ; i < 1000; i++) {
			//System.out.println("hi");
			System.out.println(t.get(i));	
		}
		
		for(int i = 500 ; i>=0; i--) {
				//System.out.println("hi");
			t.delete(i);	
		}
		for(int i = 0 ; i < 1000; i++) {
			//System.out.println("hi");
			System.out.println(t.get(i));	
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
