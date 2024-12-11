class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Default constructor
    public Person() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    // Constructor with parameters
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName; // Add space between first and last name
    }
