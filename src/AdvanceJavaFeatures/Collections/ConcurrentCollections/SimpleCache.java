package AdvanceJavaFeatures.Collections.ConcurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/*
This cache class is implemented with thread safety in mind with the use of concurrent hash map
which provides thread safety mechanism such data partitioning,Atomic operations, read operation
without locking etc...
 */
public class SimpleCache<K, V> {
  private final Map<K, V> cache;

  public SimpleCache() {
    cache = new ConcurrentHashMap<>();
  }

  public void put(K key, V value) {
    cache.put(key, value);
  }

  public V get(K key) {
    return cache.get(key);
  }

  public void remove(K key) {
    cache.remove(key);
  }

  public boolean containsKey(K key) {
    return cache.containsKey(key);
  }

  public int size() {
    return cache.size();
  }

  public void clear() {
    cache.clear();
  }

  public static void main(String[] args) {
    SimpleCache<String, Integer> cache = new SimpleCache<>();

    cache.put("key1", 100);
    cache.put("key2", 200);
    cache.put("key3", 300);

    System.out.println("Size of cache: " + cache.size());
    System.out.println("Value for key 'key2': " + cache.get("key2"));

    cache.remove("key1");
    System.out.println("Contains key 'key1': " + cache.containsKey("key1"));

    cache.clear();
    System.out.println("Size of cache after clearing: " + cache.size());
  }
    }