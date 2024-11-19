public class Grade {

    public static char findGrade(int age) {
        
        return 'A';
    }

    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide an age as an argument.");
            return;
        }

        // Parse the age from command line arguments
        int age = Integer.parseInt(args[0]);

        // Get the grade using the findGrade method
        char grade = findGrade(age);

        // Print the grade
        System.out.println("The grade is: " + grade);
    }
}
