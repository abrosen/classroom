package tables;



public class HashTableOpen<K,V> {

	Entry<K,V>[] table;

	private static final int START_CAPACITY = 101;
	private double LOAD_THRESHOLD = 0.67;

	private int size = 0;
	private int numDeletes = 0;

	private final Entry<K, V> DELETED =  new Entry<K, V>(null, null);


	public HashTableOpen(){
		table =  new Entry[START_CAPACITY];
	}




	// find appropriate index
	// if index already has key, overwrite
	// otherwise size ++ 
	public boolean put(K key, V value){
		int index = find(key);
		if(table[index] == null){
			table[index] =  new Entry<K,V>(key, value);
			size++;
			
			
			// handle rehashing
			double loadFactor = ((double)(size + numDeletes)) / table.length; 
			if(loadFactor >= this.LOAD_THRESHOLD){
				this.rehash();
			}
			
		} else{
			table[index] =  new Entry<K,V>(key, value);
		}
		
		
		return true;
	}

	public V get(K key){
		int index = find(key);
		if(table[index] == null){
			return null;
		}
		
		return table[index].getValue();
	}


	public V delete(K key){
		int index = find(key);
		if(table[index] == null){
			return null;
		}
		
		V val  =  table[index].getValue();
		table[index] =  DELETED;
		size--;
		numDeletes++;
		
		return val;
	}



	// finds the index corresponding to the key
	// returns index of key if key exists or index of closest null
	// assumes there is always an empty spot
	// handles collisions
	// handles wrap arounds
	// handles finding the key

	private int find(K key) {
		int index  =  key.hashCode() % table.length;

		int numProbes = 0;
		while( table[index] !=  null && 
				!(table[index].getKey().equals(key))){
			
			numProbes++;
			index += numProbes*numProbes;
			if(index >=  table.length){
				index = index % table.length;
			}
		}
		
		return index;
	}



	private void rehash() {	
		Entry<K,V>[] oldTable = this.table;
		
		table = new Entry[table.length*2 + 1];
		size = 0;
		numDeletes = 0;
		for(Entry<K,V> item : oldTable){
			if(item == null || item.getKey() == null){
				continue;
			}
			
			this.put(item.getKey(), item.getValue());
		}
		
		
		
	}

	public int size(){
		return size;
	}
	
	public String toString(){
		StringBuilder b = new StringBuilder();
		b.append("[");
		for(Entry<K,V> item : table){
			if(item != null){
			
				String rendering = "(" + item.getKey()+", "
									+ item.getValue()  + ") ";
				b.append(rendering);
			}
		}
		b.append("]");
		return b.toString();
	}
	
	public static void main(String[] args){
		HashTableOpen<String, Integer> ht = new HashTableOpen<String, Integer>();
		ht.put("Foo", 1);
		ht.put("bar", 2);
		for(int i = 0; i<200; i++){
			ht.put(i+"", 2*i);
		}
		ht.delete("30");
		
		System.out.println(ht.toString());
		
	}

}
