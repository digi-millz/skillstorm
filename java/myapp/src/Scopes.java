public class Scopes {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
        one.age = 12;
        two.age = 14;
        // static function cant be modified
        // one.planet = "Earth";
        // System.out.println(two.planet);
    }
}

class Person {
    // instance variable
    int age;
    // class varible
    static String planet;

    public void move(int distance) {
        {
            // block scope variable
            // int x = 10;
            distance = 10;
        }
        // block variable not accessible
        // x = 9;
        distance = 11;

    }

}