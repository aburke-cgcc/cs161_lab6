import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        //create the students
        Student student1 = new Student(1, "John Smith");
        Student student2 = new Student(2, "Jane Doe");

        //create the instructors
        ArrayList<Instructor> instructors = new ArrayList<Instructor>();
        instructors.add(new Instructor(3, "Andrew Burke"));
        instructors.add(new Instructor(4, "Robert Surton"));

        //create the course
        ArrayList<Course> courses = new ArrayList<Course>();

        //set course instructors
        courses.add(new Course("Programming & Problem Solving", "cs161", instructors.get(0)));
        courses.add(new Course("Data Structures & Algorithms", "cs260", instructors.get(1)));

        //keep a list of enrollments
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();

        //enroll students
        enrollments.add(new Enrollment(student1, courses.get(0), true));
        enrollments.add(new Enrollment(student2, courses.get(0), false));
        enrollments.add(new Enrollment(student2, courses.get(1), true));

        //check enrollments
        for(Enrollment e : enrollments){
            System.out.println(e.getStudent().getFirstName() + " -> " + e.getCourse().getName() + "(" + e.getCourse().getInstructor().getLastName() + ")" + " - paid: " + e.isPaid());
        }
        System.out.println();

        //check instructor's courses
        courses.get(0).printEnrolledStudents(enrollments);
        System.out.println();
        instructors.get(0).printCoursesTaught(courses);
        System.out.println();
        instructors.get(1).printCoursesTaught(courses);
    }

    
}