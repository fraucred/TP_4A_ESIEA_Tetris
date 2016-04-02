package BidaMaTri.tetrisBMT.items;

/**
 * Created by David_MAWork on 26/03/2016.
 */
public enum Tetrominos implements Tetromino {
    ONE(1,tetromino("1")),
    TWO(2,tetromino("2")),
    THREE(3,tetromino("3")),
    FOUR(4,tetromino("4"));

    Tetrominos(int i, Tetromino tetromino) {
    }

    private static Tetromino tetromino(String s) {      // Standby
        switch (Integer.parseInt(s)){
            case 1:
                firstTetromino();
            case 2:
                secondTetromino();
            case 3:
                thirdTetromino();
            case 4:
                fourthTetromino();
            default:

        }
        return noneTetromino();
    }

    private static Tetromino firstTetromino() {
        Object exemple1 = null;
        return (Tetromino) exemple1;
    }
    private static Tetromino secondTetromino() {
        Object exemple1 = null;
        return (Tetromino) exemple1;
    }
    private static Tetromino thirdTetromino() {
        Object exemple1 = null;
        return (Tetromino) exemple1;
    }
    private static Tetromino fourthTetromino() {
        Object exemple1 = null;
        return (Tetromino) exemple1;
    }
    private static Tetromino noneTetromino() {
        Object exemple1 = null;
        return (Tetromino) exemple1;
    }


}
