public class Game {

    private int sizeX;
    private int sizeY;
    private int amountOfEnemies;
    private int transistorsNeed;
    private int movesLeft;
    private int flowersGathered;
    private Field field;
    private boolean isGameFinished = false;

    public Game(int sizeX, int sizeY, int amountOfEnemies,
                int transistorsNeed, int movesLeft) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.amountOfEnemies = amountOfEnemies;
        this.transistorsNeed = transistorsNeed;
        this.movesLeft = movesLeft;
        field = new Field(sizeX, sizeY)
    }

    public void fillFieldWithEmptyObjects(){
        for (int =0; i < sizeX; i++) {
            for (int j = 0; j < sizeY){
                field.setFieldable(i, j, new Empty());
            }
        }
    }
    public void startGame() {

        possesPlayer();
        possesEnemies();
        possesFlowers();

        while(!isGameFinished) {

        showField();
        playerTurn();
        computerTurn();
        checkIfGameNotFinished();
        }
    }
    private void possesPlayer() {

    }
    private void possesEnemies() {

    }
    private void possesFlowers() {

    }
    private void showField() {

    }
    private void playerTurn() {

    }
    private void computerTurn() {

    }
    private void checkIfGameNotFinished (){

    }
}
