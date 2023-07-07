public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Number of command-line arguments: " + args.length);

        System.out.println("Command-line arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
