import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            String result = "";
            for(int j = 1; j <= i; j++) {
                result = result +  i;
            }

            System.out.println(result);
        }

    }
}
