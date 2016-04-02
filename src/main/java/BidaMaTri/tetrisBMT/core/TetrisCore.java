package BidaMaTri.tetrisBMT.core;

import BidaMaTri.tetrisBMT.core.subCore.TetrisBoard;
import BidaMaTri.tetrisBMT.items.TetrominoFactory;
import BidaMaTri.tetrisBMT.display.Printer;
import BidaMaTri.tetrisBMT.items.Tetromino;
import BidaMaTri.tetrisBMT.movement.InputReader;
import BidaMaTri.tetrisBMT.movement.Movement;
import BidaMaTri.tetrisBMT.valid_op.TetrisValidator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by David_MAWork on 22/03/2016.
 */
public class TetrisCore {
    private TetrisBoard tetrisBoard;
    private TetrisValidator tetrisValidator;
    private TetrominoFactory tetrominoFactory;
    private Printer printer;
    private InputReader inputReader;
    private Collection<Movement> movements;
    private boolean isTetrisOver;

    public TetrisCore() {
        tetrisBoard = new TetrisBoard();
        tetrisValidator = new TetrisValidator();
        tetrominoFactory = new TetrominoFactory();
        printer = new Printer();
        inputReader = new InputReader();
        movements = new ArrayList<Movement>();
        isTetrisOver = false;
    }

    public void run() {                                             // méthode principale pour exécuter le Tetris
        while (!isTetrisOver) {
            readUserInput();
            refreshGrid(movements);
            randomTetromino();
            nextStep();
        }
    }

    private void readUserInput() {                                  // lire l'action du joueur
        movements = inputReader.getMovements();

    }

    private void refreshGrid(Collection<Movement> movements) {      // mettre à jour la grille du Tetris
        tetrisBoard.updateBoard(movements);
    }

    private void randomTetromino() {                                // générer aléatoirement un Tetromino
        if ( !tetrisValidator.isTetrominoPlaced() ) {
            randomGenerate();
        }
    }

    private void randomGenerate() {                                 // ajoute un Tetromino dans la grille du Tetris
        tetrisBoard.add((Tetromino) tetrominoFactory.generate());
    }

    private void nextStep() {                                       // affiche le tetris mis à jour
        if ( !tetrisValidator.isTetrisStepFinished() ) {
            printer.displayTetris(tetrisBoard);
        }
        //isTetrisOver = true;
    }

}
