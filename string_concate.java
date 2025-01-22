//CONCATE STRING

// public class string_concate {
//     public static void main(String[] args)
//     {
//         String str = new String("Hellow");
//         str.concat("World");
//         System.out.println(str);
//     }
// }



public class string_concate{                     //USING STRING BUFFER
    public static void main(String[] args)
    { 
        StringBuffer str = new StringBuffer("hello");
        str.append("sofware");
        System.out.println(str);

    }
}