import java.util.HashSet;

public class Party {
    public static void main(String[] args) {
        HashSet<Friend> friends = new HashSet<Friend>();
        friends.add(new Friend("Dan", 24));
        friends.add(new Friend("Dana", 41));
        // hashcode/equals are used to compare objects
        friends.add(new Friend("Dan", 24));
        System.out.println(friends);
        for (Friend f : friends) {
            // do something with f
            System.out.println(f);
        }
    }
}

class Friend {
    String name;
    int age;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Friend other = (Friend) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

}