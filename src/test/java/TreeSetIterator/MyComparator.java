package TreeSetIterator;

import java.util.Comparator;

class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.id == s2.id) {
            return 0;
        } else {
            return s2.perc_Of_Marks_Obtained - s1.perc_Of_Marks_Obtained;
        }
    }
}
