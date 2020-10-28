public class Pad {
    private Obdlznik grafika;
    
    public Pad() {
        this.grafika = new Obdlznik();
        
        this.grafika.zmenStrany(5, 50);
        
        this.grafika.posunZvisle(75);
        this.grafika.posunVodorovne(-60);
        
        this.grafika.zobraz();
    }
}
