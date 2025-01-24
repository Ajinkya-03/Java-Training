import java.util.Arrays;
import java.util.List;

public class stringapi {
    public static void main(String[] args)
    {
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,8,10);

        values.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
