abstract class Person{
    //attributes(members)
    protected int ID;
    protected String firstName;
    protected String lastName;

    //operations(member functions)
    public String getFirstName(){
        return firstName;
    }

    protected void setFirstName(String arg){
        firstName = arg;
    }

    public String getLastName(){
        return lastName;
    }

    protected void setLastName(String arg){
        lastName = arg;
    }

    public int getID(){
        return ID;
    }

    protected void setID(int arg){
        ID = arg;
    }

    protected String getName(){
        return firstName + " " + lastName;
    }
}