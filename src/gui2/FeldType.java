package gui2;


import javax.swing.*;
import java.io.File;

public enum FeldType {
    STRASSENFELD,
    SANDFELD,
    OELFELD,
    NAGELTEPPICH,
    REIFENSTAPEL,
    STARFELD,
    ZIELFELD,
    CHECHPOINT;


    private final ImageIcon ziel = new ImageIcon(getClass().getResource("ziel.png"));
    private final ImageIcon oelfleck = new ImageIcon(getClass().getResource("oelfleck.png"));
    private final ImageIcon sand = new ImageIcon(getClass().getResource("sand.jpg"));
    private final ImageIcon nagelteppich = new ImageIcon(getClass().getResource("nagelteppich.jpg"));
    private final ImageIcon start = new ImageIcon(getClass().getResource("start.jpg"));
    private final ImageIcon checkpoint = new ImageIcon(getClass().getResource("checkpoint.jpg"));
    private final ImageIcon reifenstapel = new ImageIcon(getClass().getResource("reifenstapel.jpg"));
    private final ImageIcon reifenstapel2 = new ImageIcon(getClass().getResource("reifenstapel2.jpg"));
    private final ImageIcon reifenstapel3 = new ImageIcon(getClass().getResource("reifenstapel3.jpg"));
    private final ImageIcon strasse = new ImageIcon(getClass().getResource("straße.png"));

    public Icon getIcon() {
        File imageCHeck = new File("src/gui2/straße.png");

        System.out.println(imageCHeck.exists());
        switch (this) {
            case OELFELD:
                return oelfleck;
            case SANDFELD:
                return sand;
            case STARFELD:
                return start;
            case CHECHPOINT:
                return checkpoint;
            case STRASSENFELD:
                return strasse;
            case NAGELTEPPICH:
                return nagelteppich;
            case REIFENSTAPEL:
                return randomStapel();
            case ZIELFELD:
                return ziel;
            default: {
                System.out.println("fehler in getIcon");
                throw new IllegalArgumentException();
            }

        }


    }

    private Icon randomStapel() {

        int x = (int) (Math.random() * 4);
        switch (x) {
            case 0: {
                return reifenstapel;
            }
            case 1: {
                return reifenstapel2;
            }
            case 2: {
                return reifenstapel3;
            }
            case 3: {
                return reifenstapel3;
            }
            default:
                return reifenstapel;
        }
    }
    /*private final ImageIcon ziel = new ImageIcon(getClass().getResource("src/gui2/ziel.png"));
    private final ImageIcon oelfleck = new ImageIcon(getClass().getResource("src/gui2/oelfleck.png"));
    private final ImageIcon sand = new ImageIcon(getClass().getResource("src/gui2/sand.jpg"));
    private final ImageIcon nagelteppich = new ImageIcon(getClass().getResource("src/gui2/nagelteppich.jpg"));
    private final ImageIcon start = new ImageIcon(getClass().getResource("src/gui2/start.jpg"));
    private final ImageIcon checkpoint = new ImageIcon(getClass().getResource("src/gui2/checkpoint.jpg"));
    private final ImageIcon reifenstapel = new ImageIcon(getClass().getResource("src/gui2/reifenstapel.jpg"));
    private final ImageIcon reifenstapel2 = new ImageIcon(getClass().getResource("src/gui2/reifenstapel2.jpg"));
    private final ImageIcon reifenstapel3 = new ImageIcon(getClass().getResource("src/gui2/reifenstapel3.jpg"));
    private final ImageIcon strasse = new ImageIcon(getClass().getResource("src/gui2/straße.png"));*/

}
