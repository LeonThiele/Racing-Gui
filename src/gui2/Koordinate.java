package gui2;

public class Koordinate {
    private int breite;
    private int hoehe;

    public Koordinate(int x, int y) {
        this.breite = x;
        this.hoehe = y;
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }


    public int getAbstand(Koordinate k){
        double x1 = (k.getBreite()-breite);
        double y1 = (k.getHoehe()-hoehe);
        double r =Math.sqrt(x1*x1+y1*y1);
        int result =  (int)r;
        return  result;

    }



}
