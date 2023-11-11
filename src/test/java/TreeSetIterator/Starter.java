package TreeSetIterator;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class Starter {
    public static TreeSet<Student> set;
    @Test
    public static void bas() {
        //Instantiating MyComparator

        MyComparator comparator = new MyComparator();

        //Creating TreeSet with 'MyComparator' as Comparator.

        set = new TreeSet<Student>(comparator);

        //Adding elements to TreeSet

        set.add(new Student(121, "Santosh", 85));

        set.add(new Student(231, "Cherry", 71));

        set.add(new Student(417, "David", 82));

        set.add(new Student(562, "Praveen", 91));

      //  set.add(new Student(231, "Raj", 61));         //Duplicate element

        set.add(new Student(458, "John", 76));

        set.add(new Student(874, "Peter", 83));

       // set.add(new Student(231, "Hari", 52));       //Duplicate element

        set.add(new Student(568, "Daniel", 89));

        //Iterating though TreeSet

        Iterator<Student> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
