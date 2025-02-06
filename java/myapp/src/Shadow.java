//variable shadowing
public class Shadow {
    public static void main(String[] args) {
        Child c = new Child();
        int returned = c.getX();
        System.out.println(returned);
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 5;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        // super is used to access the parent class variables
        System.out.println(super.x);
        // this is used to access the child class variables
        System.out.println(this.x);
        // x is used to access the current class variables
        return x;
    }
}