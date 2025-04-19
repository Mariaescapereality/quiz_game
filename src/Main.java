import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java quiz game
        //questions array[]
        String[] questions = {"What is the main function of a router?",
                                "Which part of computer is considered the brain?",
                                "What year was facebook launch?",
                                "Who is known as the father of computers?",
                                "What was the first programming language?"};
        //options array[]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                                {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                                {"1. COBOL", "2. C", "3.Fortran", "4. Assembly"}};

        //declare variables + keys
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess = 0;
        Scanner scanner = new Scanner(System.in);
        //welcome message
        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");
        //question (loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            //      options
            for (String option : options[i]) {
                System.out.println(option);
            }
            //      get guess from user
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            //      check our guess
            if (guess == answers[i]) {
                System.out.println("**********");
                System.out.println(" Correct! ");
                System.out.println("***********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println(" Wrong! ");
                System.out.println("********");
            }
        }
        //display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}