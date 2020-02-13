import java.util.Date;

class Enrollment{
    //attributes (members)
    private Student student;
    private Course course;
    private Date dateEnrolled = new Date();
    private boolean paid = false;

    //operations (member functions)
    public Enrollment(Student s, Course c, boolean p){
        setStudent(s);
        setCourse(c);
        setPaid(p);
    }

    public Student getStudent(){
        return student;
    }

    public void setStudent(Student arg){
        student = arg;
    }

    public Course getCourse(){
        return course;
    }

    public void setCourse(Course arg){
        course = arg;
    }

    public Date getDate(){
        return dateEnrolled;
    }

    public void setPaid(boolean arg){
        paid = arg;
    }

    public String isPaid(){
        if(paid)
            return "yes";
        else
            return "no";
    }
}