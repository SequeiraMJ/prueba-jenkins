public class ejemplo_jenkins {
    public static void main(String[] args) {
        /*
         * Print the message “Hello, I am <NAME> and I am printing the number <X>”
         * NAME must be a parameter required to run the application
         * X is the index of the iteration
         */
        String name = "Macgyver";
        for (int i = 0; i < 15; i++) {
            System.out.println("Hello, I am " + name + " and I am printing the number " + (i+1));
        }
    }
}
