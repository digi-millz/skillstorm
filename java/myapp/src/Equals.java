public class Equals {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

}

class Pizza {
    int size = 0;
    String topping = null;

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + size;
        result = prime * result + ((topping == null) ? 0 : topping.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pizza other = (Pizza) obj;
        if (size != other.size)
            return false;
        if (topping == null) {
            if (other.topping != null)
                return false;
        } else if (!topping.equals(other.topping))
            return false;
        return true;
    }
}
