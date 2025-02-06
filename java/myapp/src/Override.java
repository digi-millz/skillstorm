public class Override {
    public static void main(String[] args) {
        Poppable p = new Balloon();
        p.pop();
        Poppable b = new Bubble();
        b.pop();
    }
}

class Poppable {
    public void pop() {
        System.out.println("Popped!");
    }
}

class Balloon extends Poppable {
    public void pop() {
        System.out.println("Balloon popped!");
    }
}

class Bubble extends Poppable {
    public void pop() {
        System.out.println("Bubble popped!");
    }
}