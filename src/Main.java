import java.util.Scanner;

public class Main {
    public static int rows =3;
    public static int columns =4;
    public static int amountOfEnemies=10;
    public static int transistorsNeed=100;
    public static int moves=40;
    public static int amountOfFlowers = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;

	do {
	    System.out.println("Welcome to JavaGame. Please choice and press enter");
        System.out.println("1:Start new game");
        System.out.println("2: Options");
        System.out.println("3: Author");
        System.out.println("4: Exit");

        command = scanner.nextLine();

        switch (command) {
            case "1":
                startNewGame();
                break;
            case "2":
                OptionsMenu.showOptionsMenu();
                break;
            case "3":
                showCredits();
                break;
            case "4":
                break;
            default:
                System.out.println("Command not recognized! Please try again");
        }

    }
	while (!command.equals("4"));
    }

    private static void startNewGame() {
        Game game = new Game(rows, columns, amountOfEnemies, transistorsNeed, moves, amountOfFlowers);

        game.fillFieldWithEmptyObjects();

        game.startGame();
    }
    private static void openOptionsMenu() {
    }
    private static void showCredits() {
        System.out.println("\nCreated by Marina\n version 1.0\n");
    }
}
