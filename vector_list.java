import java.util.Vector;
public record vector_list() {
    public static void main(String[] args)
    {
        Vector al = new Vector<>();
        al.add(10);
        al.add("ajinkya");
        al.add(null);
        al.add(10.50);

        System.out.println(al);
    }
}