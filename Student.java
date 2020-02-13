class Student extends Person{
    public Student(int id, String name){
        setID(id);
        setFirstName(name.split(" ")[0]);
        setLastName(name.split(" ")[1]);
    }
}