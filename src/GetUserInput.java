
import java.util.Scanner;

public class GetUserInput {
    public static String start(){
        Scanner in = new Scanner(System.in);
        System.out.print(
        	      "Input a expression, only two numbers less 10, like 3+10: ");
        String user_input = in.nextLine();
        in.close();
        return user_input;
    }
}
