class Person {
    String firstName;
    String lastName;
    int age;

    
    public Person() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    
    public String getFullName() {
        return firstName + " " + lastName; // Add space between first and last name
    }
}

public class Practical1 {
    public static void main(String[] args) {
        
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("Alice", "Smith", 25);

        
        System.out.println("Person 1: " + person1.getFullName());
        System.out.println("Person 2: " + person2.getFullName());


        double averageAge = (person1.age + person2.age) / 2.0;
        System.out.println("Average Age: " + averageAge);
    }
}
