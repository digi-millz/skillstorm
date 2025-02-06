public class Method {

    public static void main(String[] args) {
        Method m = new Method();
        int returned = m.go();
        int value = Method.go(5);

        System.out.println(returned);
        System.out.println(value);
    }

    public int go() {
        return 1;
    }

    public static int go(int a) {
        return a;
    }
}
