public class Arrays {

    public static void main(String[] args) {
        // define an array
        int[] numbers = new int[6];
        numbers[0] = 155;
        numbers[5] = 77;
        System.out.println(numbers[5]);

        // use array initializer
        String[] names = { "John", "Jane", "Joe" };
        names[2] = "Jill";
        names.toString();
        System.out.println(String.join(", ", names));
    }
}
