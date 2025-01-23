import java.util.*;
// comparator Interface is used to reverse the sortded order. It override the compare method of comparator interface

class Mycomparator implements Comparator<Integer> 
{
    public int compare(Integer i1, Integer i2) 
    { 
        // Descending order
        // this will sort in descending order
        return i2.compareTo(i1);
    }
}

public class customise_sort {
    public static void main(String[] args) 
    {
        SortedSet<Integer> ss = new TreeSet<Integer>(new Mycomparator());

        ss.add(10);
        ss.add(20);
        ss.add(90);
        ss.add(50);
        ss.add(100);
        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());

    }
}