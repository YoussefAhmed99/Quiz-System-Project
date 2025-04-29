import utils.ConsoleHandler;
import services.UserService;
import services.QuizService;
import models.User;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter your nickname: ");
        String nickname = ConsoleHandler.getNextLine();
        User user = new UserService().initiateUser(nickname);
        System.out.println("Welcome " + nickname + "!");
        
        Thread.sleep(1000);

        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1) take a quiz");
        System.out.println("2) create a quiz");
        System.out.println("3) view leaderboards");

        int userSelection = ConsoleHandler.getNextInt();
        System.out.println(userSelection);

        switch (userSelection) {
            case 1:
            QuizService svc = new QuizService();
            svc.viewQuizzes();
                break;
            
            case 2:

                break;

            case 3:

                break;
            
            default:
                break;
        }
    }
}