import java.util.ArrayList;

class Instructor extends Person{
    public Instructor(int id, String name){
        setID(id);
        setFirstName(name.split(" ")[0]);
        setLastName(name.split(" ")[1]);
    }

    public ArrayList<Course> getCoursesTaught(ArrayList<Course> courses){
        ArrayList<Course> coursesTaught = new ArrayList<Course>();

        for(Course c : courses)
            if(c.getInstructor() == this)
                coursesTaught.add(c);

        return coursesTaught;
    }

    public void printCoursesTaught(ArrayList<Course> courses){
        System.out.println("Courses taught by " + getName() + ":");
        for(Course c : courses)
            if(c.getInstructor() == this)
                System.out.println(c.getCourseNumber() + " - " + getName());
    }
}