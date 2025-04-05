package Person;

public abstract class Person {
    double id;
    String name;
    String email;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
        this.id = Math.random();
    }

    abstract void displayInfo();
}
