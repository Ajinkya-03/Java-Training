import java.util.Optional;

public class optional_class {
    public static void main(String[] args)
    {
        String s=null;

        // if (s==null)
        // {
        //     System.out.println("String is null");
        // }
        // else
        // {
        //     System.out.println(s.length());
        // }
        Optional<String> optionallen=Optional.ofNullable(s);
        System.out.println(optionallen.isPresent());
        System.out.println(optionallen.isEmpty());
        System.out.println(optionallen.orElse("mohit"));
    }

}
