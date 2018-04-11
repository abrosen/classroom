package tables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HashTableChaining<K,V> {
	LinkedList<Entry<K,V>>[] table;
			

	private static final int START_CAPACITY = 101;
	private double LOAD_THRESHOLD = 3.0;
	private int size = 0;

	
	public HashTableChaining() {
		table = new LinkedList[START_CAPACITY];
	}
	
	
	
	private boolean put(K key, V value){
		int bucket =  find(key);
		
		if( table[bucket]  == null){
			table[bucket] =  new LinkedList<Entry<K,V>>();
		}
		
		Entry<K,V> item = new Entry<K,V>(key, value);
		
		
		if(table[bucket].contains(item)){
			table[bucket].remove(item);
		}
		
		table[bucket].add(item);
		size++;
		
		
		
		double loadFactor = ((double) 	(size))/table.length;
		if( loadFactor >=  LOAD_THRESHOLD){
			this.rehash();
		}
		
		return true;
	}
	
	
	
	private void rehash() {
		LinkedList<Entry<K,V>>[] oldTable = table;
		table =  new LinkedList[table.length*2 + 1];
		size=0;
		
		for(LinkedList<Entry<K,V>> bucket : oldTable){
			if(bucket == null){
				continue;
			}
			for(Entry<K,V> item: bucket){
				this.put(item.getKey(), item.getValue());
			}
			
		}
		
	}

	public V get(K key){
		int index =  find(key);
		
		LinkedList<Entry<K,V>> bucket = table[index];
		
		for(Entry<K,V> item : bucket){
			if(item.getKey().equals(key)){
				return item.getValue();
			}
		}
		
	
		return null;
	}
	
	
	public V delete(K key){
		int index =  find(key);
		LinkedList<Entry<K,V>> bucket = table[index];
		
		for(Entry<K,V> item : bucket){
			if(item.getKey().equals(key)){
				V retVal = item.getValue();
				
				bucket.remove(item);
				size--;
				return retVal;
			}
		}
		
	
		return null;
	}
	

	private int find(K key){
		int index = key.hashCode() % table.length;
		
		return index;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		Map map = new HashMap();
	}

}
