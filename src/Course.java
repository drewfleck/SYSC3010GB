import java.util.ArrayList;

public class Course
{
    private String id;
    private String name;
    private Professor professor;
    private ArrayList<Student>students;
    
    public Course( String id, String name) {};
    
    public String getId() { return id; }
    public String getName( ) { return null; }

    public String toString() { return null; }
    public boolean equals(Object o) { return false; }

    public void setProfessor(Professor professor) {};
    public Professor getProfessor() { return null; }

    public void addStudent( Student student ) {};
    public void removeStudent( Student student ) {};
    public Student[] getStudents() { return null; }
    
    
}
