package hashCodeEqualMethod;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // Generate hash code based on id and name
        int result = Integer.hashCode(id);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the objects are the same
        if (this == obj) return true;
        // Check if obj is an instance of Person
        if (obj == null || getClass() != obj.getClass()) return false;
        // Cast obj to Person and compare fields
        Person person = (Person) obj;
        return id == person.id && (name != null ? name.equals(person.name) : person.name == null);
    }
}
