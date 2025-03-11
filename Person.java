import java.time.LocalDate;

public class Person {

    String name;
    int age;
    LocalDate dob;

    Person(){
        System.out.println("Calling Default Constructor");
        this.name = "Naman";
        this.age = 21;
        this.dob = LocalDate.of(2003, 8, 6);
    }

    Person(Person person){
        System.out.println("Calling Copy Constructor");
        this.name = person.name;
        this.age = person.age;
        this.dob = person.dob;
    }

    Person(String name, int age, LocalDate date){
        System.out.println("Calling Parameterised Constructor");
        this.name = name;
        this.age = age;
        this.dob = date;
    }

    public void getPersonDetails(){
        System.out.println("Person name: " + this.name);
        System.out.println("Person age: "+this.age);
        System.out.println("Person dob: "+this.dob);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.getPersonDetails();

        System.out.println();
        Person p2 = new Person(p1);
        p2.getPersonDetails();

        System.out.println();
        Person p3 = new Person("Manvi Grover",21, LocalDate.of(2003, 3, 17));
        p3.getPersonDetails();
    }
}
