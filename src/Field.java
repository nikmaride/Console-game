import static java.lang.System.*;

public class Field {
    private final int rows;
    private final int columns;

    private final Fieldable[][] field;

    public Field(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        field = new Fieldable[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setFieldable(int x, int y, Fieldable object) {
        field[x][y] = object;
    }

    public Fieldable getFieldable(int x, int y) {
        return field [x][y];
    }

    public void showField() {

        for (int i = 0; i < rows; i++){
           System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(field[i][j].getSymbol());
            }
        }
        out.println();
    }
}
