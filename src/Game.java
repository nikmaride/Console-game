import java.util.ArrayList;
import java.util.Random;

public class Game {

    private int rows;
    private int columns;
    private int amountOfEnemies;
    private int transistorsNeed;
    private int turnsLeft;
    private int flowersGathered;
    private Field field;
    private boolean isGameFinished = false;
    private int amountOfFlowers;
    private ArrayList<flower> flowerArrayList = new ArrayList<flower>();
    private Random randomNumber = new Random()
    public Game(int i, int rows, int columns, int amountOfEnemies,
                int transistorsNeed, int turnsLeft, int amountOfFlowers) {
        this.rows = rows;
        this.columns = columns;
        this.amountOfEnemies = amountOfEnemies;
        this.amountOfFlowers = amountOfFlowers;
        this.transistorsNeed = transistorsNeed;
        this.turnsLeft = turnsLeft;
        field = new Field(rows, columns);
    }

    public void fillFieldWithEmptyObjects(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                field.setFieldable(i, j, new Empty());
            }
        }
    }
    public void startGame() {

        possessPlayer();
        possessEnemies();
        possessFlowers();

        while(!isGameFinished) {

        showField();
        playerTurn();
        computerTurn();
        checkIfGameNotFinished();

        }
    }
    private void possessPlayer() {

    }
    private void possessEnemies() {

    }
    private void possessFlowers() {

    generateFlowers();

    }
    private void showField() {

        System.out.println("\n Turns left: "+ turnsLeft
        + ", flowers gathered: " + flowersGathered
        + "/" +transistorsNeed);
        field.showField();

    }
    private void playerTurn() {

    }
    private void computerTurn() {

    }
    private void generateFlowers() {
        for(int i = amountOfFlowers - flowerArrayList.size(); i > 0; i-- ) {

        }
    }
    private void checkIfGameNotFinished (){

        if (turnsLeft == 0) {
            System.out.println("No more turns left. You lost:(");
            isGameFinished = true;
        }
        else if (flowersGathered >= 100) {
            System.out.println("You won!");
            isGameFinished = true;
        }
    }
}
