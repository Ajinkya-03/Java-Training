import java.util.LinkedHashMap;

public record linked_hashmap() {
    public static void main(String[] args) {
        LinkedHashMap<String, Object> lh = new LinkedHashMap<>();
        lh.put("name1", "ajinkya");
        lh.put("name2", "ajinkya");
        lh.put("key1", null);
        lh.put("key2", 10.50);
        lh.put("key3", 10.50);

        System.out.println(lh);
    }
}
