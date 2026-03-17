public class UC5 {

    public static void main(String[] args) {

        // Default case when no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Enhanced for loop to process all names
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}