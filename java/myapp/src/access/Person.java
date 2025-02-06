package access;

public class Person {
    Computer computer = new Computer();
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void code() {
        computer.code();
    }
}

class House {
    public void tenant() {
        Person person = new Person();
        // person.age = -1;
        person.setAge(20);
        System.out.println(person.getAge());
        person.computer = new Computer();
    }
}