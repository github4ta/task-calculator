import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = Main.calc(input);
        System.out.println(result);
    }
}
