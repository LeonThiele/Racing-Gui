package gui2;

import javax.swing.*;
import java.awt.*;


public class Board {


    private int rows = 10;
    private int cols = 10;
    private Feld f = null;
    //private HashSet<Feld> board = new HashSet<>();
    private Feld[][] board = new Feld[cols][rows];
   private final static JFrame meinFrame = new JFrame("Rennstrecke");

    public void setUpBoard(int[][] map) {



        meinFrame.setSize(1000, 1000);
        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(rows, cols);
        panel.setBackground(new Color(0, 0, 0));

        panel.setLayout(grid);
        panel.setPreferredSize(new Dimension(800, 800));


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (map[i][j]) {
                    case (1): {
                        f = new Feld(FeldType.REIFENSTAPEL, new Koordinate(i, j));
                        f.setIcon(FeldType.REIFENSTAPEL.getIcon());
                        break;
                    }
                    case (2): {
                        f = new Feld(FeldType.STRASSENFELD, new Koordinate(i, j));
                        f.setIcon(FeldType.STRASSENFELD.getIcon());
                        break;

                    }
                    case 3: {
                        f = new Feld(FeldType.SANDFELD, new Koordinate(i, j));
                        f.setIcon(FeldType.SANDFELD.getIcon());
                        break;
                    }
                    case 4: {
                        f = new Feld(FeldType.ZIELFELD, new Koordinate(i, j));
                        f.setIcon(FeldType.ZIELFELD.getIcon());
                        break;

                    }
                    case 5: {
                        f = new Feld(FeldType.NAGELTEPPICH, new Koordinate(i, j));
                        f.setIcon(FeldType.NAGELTEPPICH.getIcon());
                        break;
                    }
                    case 6: {
                        f = new Feld(FeldType.OELFELD, new Koordinate(i, j));
                        f.setBackground(new Color(128, 128, 128));
                        f.setIcon(FeldType.OELFELD.getIcon());
                        break;
                    }
                    case 7: {
                        f = new Feld(FeldType.STARFELD, new Koordinate(i, j));
                        f.setIcon(FeldType.STARFELD.getIcon());

                        break;
                    }
                    case 8: {
                        f = new Feld(FeldType.CHECHPOINT, new Koordinate(i, j));
                        f.setIcon(FeldType.CHECHPOINT.getIcon());

                        break;
                    }

                }

                f.setBorder(null);

                board[j][i] = f;
                panel.add(f);
            }
        }

        f.setBorder(null);
        meinFrame.add(panel);
        meinFrame.setVisible(true);
        meinFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public void update() throws InterruptedException {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j].setCar(Cars.RENNWAGEN);
                Thread.sleep(400);
                board[i][j].removeCar();
            }
        }


    }
    public FeldType getType(Koordinate k){
       return board[k.getBreite()][k.getHoehe()].getType();
    }
}
