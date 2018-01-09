package HashTable;

public class HashTable<K, V> {
	public final static int INITIAL_SIZE= 5;
	public final static double LOAD_FACTOR = 0.5;
	private int size;
	private Entry<K,V>[] table; 
	
	
	public HashTable() {
		size = 0; 
		this.table =  new Entry[INITIAL_SIZE];
	}

	
	
	public void put(K key, V value) {
		int index = key.hashCode() % table.length; 
		
		while(table[index] != null ) {

			if(key.equals(table[index].key)) {
				break;
			}
			System.out.println("Collision for key " + key);
			index= index + 1 % table.length;
			
		}
		table[index] = new Entry<K,V>(key, value);
		
		size++;
		// if hash table is too big, rehash()
		if(1.0 * size / table.length >  LOAD_FACTOR) {
			rehash();
		}
		
	}

	public V get(K key) {
		int index =  key.hashCode() % table.length;
		while(table[index] != null) {
			if(key.equals(table[index].key)) {
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
		table =  new Entry[table.length * 2 + 1];
		for(int i = 0; i< oldTable.length; i++) {
			if(oldTable[i] == null  || oldTable[i].key == null) {
				continue;
			} else {
				Entry<K,V> entry =  oldTable[i]; 
				this.put(entry.key, entry.value);
			}
			
		}
		
	}
	
	public V delete( K key) {
		V retval  = null;
		int index =  key.hashCode() % table.length;
		
		while(table[index] != null) {
			if(table[index].key.equals(key)) {
				retval = table[index].value;
				table[index].key = null;
				table[index].value = null;
				return retval;
			} else {
				index = index + 1  %  table.length;
			}
			
		}
		
		return retval;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		HashTable<Integer, String> h =  new HashTable<Integer, String>();
		h.put(1, "1");
		h.put(6, "6");
		
		
		for(int i =1000; i>=0; i--) {
			h.put(i, i+"");
		}
		
		for(int i =0; i<500; i++) {
			h.delete(i);
		}
		
		for(int i = 0; i <= 1000; i++) {
			System.out.println(h.get(i));
		}
		
		
		
	}
	
	
}
