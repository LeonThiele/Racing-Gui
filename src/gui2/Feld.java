package gui2;

import javax.swing.*;
import java.io.File;

public class Feld extends JButton {

    private FeldType type;
    private boolean car = false;
    private int breite;
    private int hoehe;
    private Koordinate koordinate;


    public Feld(FeldType type, Koordinate k) {
        this.type = type;
        this.koordinate=k;
    }
    public Feld(FeldType type){
        this.type=type;
    }


    public boolean hasCar() {
        return car;
    }

    public void setCar(Cars carType) {
        this.setVisible(false);
        ImageIcon carImage=null;
        switch (carType) {
            case SUV:carImage = new ImageIcon(getClass().getResource("SUV.jpg")); break;
            case VAN:carImage = new ImageIcon(getClass().getResource("Van.png")); break;
            case TRUCK:carImage = new ImageIcon(getClass().getResource("truck.jpg")); break;
            case JEEP:carImage = new ImageIcon(getClass().getResource("jeep.jpg")); break;
            case OLDTIMER:carImage = new ImageIcon(getClass().getResource("oldtimer.png")); break;
            case RENNWAGEN:carImage = new ImageIcon(getClass().getResource("rennwagen.jpg")); break;
            case SCOOTER: carImage = new ImageIcon(getClass().getResource("scooter.jpg")); break;
            case SPORTWAGEN:carImage = new ImageIcon(getClass().getResource("sporteagen.png")); break;
        }
        this.setIcon(carImage);
        this.setVisible(true);
    }

    public void removeCar() {
        setVisible(false);
        this.setIcon(type.getIcon());
        this.setVisible(true);
    }

    public FeldType getType() {
        return type;
    }

    public int getBreite() {
        return breite;
    }


    public int getHoehe() {
        return hoehe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feld feld = (Feld) o;

        if (breite != feld.breite) return false;
        return hoehe == feld.hoehe;
    }

    @Override
    public int hashCode() {
        int result = breite;
        result = 31 * result + hoehe;
        return result;
    }
}
