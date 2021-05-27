import java.util.Scanner;

public class OptionsMenu {
    static Scanner scanner = new Scanner(System.in);
    static int command;
    public static void showOptionsMenu (){
        do {
            System.out.println("Make your choice and press Enter\n"+
                                "1: Show current settings\n"+
                                "2: Change settings\n"+
                                "3: Exit");
            command = scanner.nextInt();

            switch (command){
                case 1:
                    System.out.println("\n Current settings\n"+
                            "rows: " + Main.sizeX+
                            "\n columns: " +Main.sizeY+
                            "\n enemies: " +Main.amountOfEnemies+
                            "\n transistors: "+Main.transistorsNeed+
                            "\n moves: "+Main.moves);
                    break;
                case 2:
                    System.out.println("Enter a new value for rows: ");
                    Main.sizeX = scanner.nextInt();
                    System.out.println("Enter a new value for columns: ");
                    Main.sizeY = scanner.nextInt();
                    System.out.println("Enter a new value for enemies: ");
                    Main.amountOfEnemies = scanner.nextInt();
                    System.out.println("Enter a new value for transistors: ");
                    Main.transistorsNeed = scanner.nextInt();
                    System.out.println("Enter a new value for moves: ");
                    Main.moves = scanner.nextInt();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Command not recognized. Please try again");
                    break;

            }
        }
        while (command != 3);
    }
}
