package hash;





// Transform arbitrary key type to an index (integer)
// -> Use hashCode()
// Don't have infinite space to store giant array
// -> Use a small array and grow it, mod  by size to turn integers into valid index
// If I don't have an infinite size array, two keys might have same index (collision)
// -> Use Open Addressing or Chaining

import java.util.Arrays;

public class HashTable<K,V> {
    private Entry<K,V>[] table;
    private int size;
    private int numDeleted;
    private static final double MAX_CAPACITY = 0.75;
    private static final Entry DELETED = new Entry(null, null);


    public HashTable(){
        this.table = new Entry[11];
        this.size = 0;
        this.numDeleted = 0;
    }



    public V put(K key, V val) {
        int index =  this.find(key);
        if(table[index] == null){
            size++;
        }

        table[index] =  new Entry(key, val);

        if((size +numDeleted*1.0)/ table.length  > MAX_CAPACITY) {
            rehash();
        }

        return val;
    }

    public V get(K key) {
        int index =  find(key);
        if(table[index]== null){
            return null;
        }
        return table[index].value;
    }


    public boolean contains(K key ){
        int index =  find(key);
        return table[index] != null;
    }

    public V delete(K key) {
        int index =  find(key);
        V retval = null;
        if(table[index] != null) {
            retval =  table[index].value;
            table[index] = DELETED;
            size--;
            numDeleted++;
        }
        return retval;
    }




    private int find(K key) {
        int index =  key.hashCode() % table.length;
        while(table[index] != null && !key.equals(table[index].key)){
                index = (index + 1) %  table.length;
        }
        return index;

    }

    private void rehash() {
        Entry<K,V>[]  oldTable = table;
        table = new Entry[table.length * 2 + 1];
        size = 0;

        for(int i = 0 ; i < oldTable.length ; i++) {
            if(oldTable[i] == null || oldTable[i] == DELETED )  {
                continue;
            }
            K key = oldTable[i].key;
            V val = oldTable[i].value;

            this.put(key,val);
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for(Entry entry : table){
            if(entry== null  || entry == DELETED){
                continue;
            }
            out.append(entry + " ");
        }

        return out.toString();
    }

    public static void main(String[] args) {
        HashTable<Integer, String>  hashTable = new HashTable<Integer, String>();
        for (int i = 0; i < 5; i++) {
            hashTable.put(i,""+i);
            System.out.println(hashTable);
        }
        hashTable.put(16,"16");
        hashTable.put(15,"16");


        hashTable.delete(16);

        System.out.println(hashTable);
        System.out.println(hashTable.contains(15));

    }
}
