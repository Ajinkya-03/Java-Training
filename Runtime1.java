//package stringPrograms
import java.util.Date;
public class Runtime1{
    public static void main(String[] args){
    
        Runtime r = Runtime.getRuntime();
            System.out.println(r.totalMemory());
            System.out.println(r.freeMemory());
            for(int i=0 ; i<122300 ; i++)
            {
                Date d = new Date();
                d=null;
            }
            System.out.println(r.freeMemory());
            r.gc();
            System.out.println(r.freeMemory());
    }
}