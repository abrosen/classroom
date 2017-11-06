package HashTable;

public class HashTable<K, V> {
	
	private int size;
	private Entry<K,V>[] table; 
	
	
	public HashTable() {
		size = 0; 
		this.table =  new Entry[5];
	}

	
	
	public void put(K key, V value) {
		int index = key.hashCode() % table.length; 
		
		while(table[index] != null ) {
			
			
			if(table[index].key.equals(key)) {
				break;
			}
			
			index= index + 1 % table.length;
			
		}
		table[index] = new Entry<K,V>(key, value);
		
		
		
		
		
		size++;
		// if hash table is too big, rehash()
		if(1.0 * size / table.length >  0.5) {
			rehash();
		}
		
	}

	public V get(K key) {
		int index =  key.hashCode() % table.length;
		while(table[index] != null) {
			if(table[index].key == null) {
				index = index + 1  %  table.length;
			}
			else if(table[index].key.equals(key)) {
				return table[index].value;
			} else {
				index = index + 1  %  table.length;
			}
			
		}
		
		return null;
	}
	


	private void rehash() {
		Entry<K,V>[] oldTable = table;
		size = 0;
		table =  new Entry[table.length * 2 +1];
		for(int i = 0; i< oldTable.length; i++) {
			if(oldTable[i] == null) {
				continue;
			} else if(oldTable[i].key == null) { 
				continue;
			} else {
				Entry<K,V> entry =  oldTable[i]; 
				int index = entry.key.hashCode()  % table.length;
				table[index] =  entry;
				size++;
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		HashTable<Integer, String> h =  new HashTable<Integer, String>();
		h.put(1, "hello");
		h.put(6, "world");
		System.out.println(h.get(1));

		System.out.println(h.get(2));
	}
	
	
}
