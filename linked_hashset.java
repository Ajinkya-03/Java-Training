import java.util.LinkedHashSet;
public record linked_hashset() {
    public static void main(String[] args)
    {
        LinkedHashSet ls = new LinkedHashSet<>();
        ls.add("ajinkya");
        ls.add("ajinkya");
        ls.add(null);
        ls.add(10);
        ls.add(10.50);

        System.out.println(ls);
    }
}

//No Dulplicates are allowed
//Sequence is not preserved