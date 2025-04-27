import utils.ConsoleHandler;
import services.UserService;
import models.User;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your nickname: ");
        String nickname = ConsoleHandler.getNextLine();
        User user = new UserService().initiateUser(nickname);
        System.out.println(user);
    }
}