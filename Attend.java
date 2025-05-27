public class Attend {
    public static void main(String[] args) {
        // Check if enough arguments are passed
        if (args.length < 5) {
            System.out.println("Please provide Name, Age, Mobile Number, Address, and SRN.");
            return;
        }

        // Assign values from command-line arguments
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String mobile = args[2];
        String address = args[3];
        String srn = args[4];

        // Print student details
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Address: " + address);
        System.out.println("SRN: " + srn);
    }
}

