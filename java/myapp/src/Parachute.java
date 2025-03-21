public class Parachute {

    public static void main(String[] args) {

        pull();

    }

    static void pull() throws DeploymentException {
        throw new DeploymentException();
    }

}

class DeploymentException extends RuntimeException {
}