package BidaMaTri.tetrisBMT;

import BidaMaTri.tetrisBMT.core.TetrisCore;

/**
 * Created by David_MAWork on 22/03/2016.
 */
public class Main {
        public static void main(String[] args) {
            TetrisCore tetrisCore = new TetrisCore();   // on instancie un jeu Tetris
            tetrisCore.run();                           // on fait tourner le Tetris
        }
}
