public class Chaining {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("java");
        System.out.println(javaDeveloper.name);
    }
}

class Employee {
    String name = "John";

    // Ran first because it is an extended constructor
    public Employee() {
        System.out.println("Employee");
    }
}

class JavaDeveloper extends Employee {
    String language;

    // Ran second because it is the default constructor
    public JavaDeveloper() {
        super();
        System.out.println(name + " is a JavaDeveloper");
    }

    // Ran last because it is a parameterized constructor
    public JavaDeveloper(String language) {
        this();
        this.language = language;
        System.out.println(language);
    }
}