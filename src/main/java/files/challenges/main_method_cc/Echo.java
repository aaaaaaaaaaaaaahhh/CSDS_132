package files.challenges.main_method_cc;

public class Echo {
    
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
