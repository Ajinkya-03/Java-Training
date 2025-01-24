import java.util.*;

public class lambda_fun {
    interface A {
        int sum(int a, int b);
    }
    public static void main(String[] args) {
        A a = (x, y) -> x + y;
        System.out.println(a.sum(10, 20));
    }

}
