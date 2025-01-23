import java.util.ArrayList;
public record array_list() {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add("ajinkya");
        al.add(null);
        al.add(10.50);

        System.out.println(al);
    }
}

//Advnatage:
    //resizable and grow are flexible
    //duplicates are allowed
    //Null are allowed
    //Insertion is preserved

//Disadvantage:
    //we need to define array sizw resulting in wastage of memory