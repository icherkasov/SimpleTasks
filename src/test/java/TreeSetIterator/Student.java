package TreeSetIterator;

public class Student {
    int id;

    String name;

    int perc_Of_Marks_Obtained;

    public Student(int id, String name, int perc_Of_Marks_Obtained)
    {
        this.id = id;

        this.name = name;

        this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
    }

    @Override
    public String toString()
    {
        return id+" : "+name+" : "+perc_Of_Marks_Obtained;
    }
}

//MainClass

