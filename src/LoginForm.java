import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name : ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password : ");
            String password = scanner.nextLine();

            if ("username".equals(userName) && "password".equals(password)) {
                System.out.println(" User successfully logged-in.. ");
                System.out.println(" Press 1 if you want to access Patients ");
                System.out.println(" Press 2 if you want to access Rooms ");
                System.out.println(" Press 3 if you want to access Employees ");

                String nextStep = scanner.nextLine();
                if (nextStep.equals("1")) {
                    System.out.println(" Welcome to Patients ");
                    //Patient klass

                } else if(nextStep.equals("2")) {
                    System.out.println(" Welcome to Rooms ");
                    //Room klass

                } else if(nextStep.equals("3")) {
                    System.out.println(" Welcome to Employees ");
                    //Employees klass

                }


            } else {
                System.out.println(" In valid username and/or password ");
            }
        }
    }
}
