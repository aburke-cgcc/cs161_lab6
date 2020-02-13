import java.util.ArrayList;

class Course{
    //attributes (members)
    private String name;
    private String courseNumber;
    private Instructor instructor;

    //operations (member functions)
    public Course(String n, String cN, Instructor i){
        setName(n);
        setCourseNumber(cN);
        setInstructor(i);
    }

    private ArrayList<Student> getEnrolledStudents(ArrayList<Enrollment> enrollments){
        ArrayList<Student> students = new ArrayList<Student>();

        for(Enrollment e : enrollments)
            if(e.getCourse() == this)
                students.add(e.getStudent());

        return students;
    }

    public void printEnrolledStudents(ArrayList<Enrollment> enrollments){
        System.out.println("Students enrolled in " + getCourseNumber() + ":");
        for(Student s : getEnrolledStudents(enrollments))
            System.out.println(s.getFirstName() + " " + s.getLastName());
    }

    public String getName(){
        return name;
    }

    public void setName(String arg){
        name = arg;
    }

    public String getCourseNumber(){
        return courseNumber;
    }

    public void setCourseNumber(String arg){
        courseNumber = arg;
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public void setInstructor(Instructor arg){
        instructor = arg;
    }
}