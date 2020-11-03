public class Pad {
    private Obdlznik grafika;
    
    public Pad(boolean pravyPod) {
        this.grafika = new Obdlznik();
        
        this.grafika.zmenStrany(5, 50);
        
        this.grafika.posunZvisle(75);
        
        if (pravyPod) {
            this.grafika.posunVodorovne(235);
        } else {
            this.grafika.posunVodorovne(-60);
        }
        
        this.grafika.zobraz();
    }
}
