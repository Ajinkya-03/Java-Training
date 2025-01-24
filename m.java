public interface m {
    public abstract int len(String s);

    default void m1(){
        System.out.println("i m i default method");
    };
}
public class m1 {
    public static void main(String[] args){
        m e=(s) -> s.length();
        System.out.println(e.len("mohit"));
        e.m1();
    }
}
