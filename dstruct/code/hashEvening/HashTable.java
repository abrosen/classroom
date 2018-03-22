package hashEvening;

public class HashTable<K,V> {
    private Entry<K,V>[] table;
    private int size;
    private static final double MAX_CAPACITY = 0.5;


    public HashTable() {
        table =  new Entry[11];
        size = 0;
    }


    private int getIndex(K key){
        return key.hashCode() % table.length;
    }



    public V put(K key, V val) {
        int index =  getIndex(key);
        if(table[index] == null) {
            table[index] = new Entry(key, val);
        } else {


            while(table[index] != null) {
                index = index + 1 % table.length ;

            }
            table[index] = new Entry(key, val);

        }




        size++;
        return val;
    }


}
