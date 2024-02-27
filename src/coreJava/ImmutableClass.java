package coreJava;

//for creating immutable class we need to add final to our object.
//also we need to use private access modifier
//we need to use only constructor and getter method not setter.
public class ImmutableClass {

    private final int id;
     private final String name;

    private final String emailId;

    public ImmutableClass(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

}
