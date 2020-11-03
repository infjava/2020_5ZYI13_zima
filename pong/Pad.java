public class Pad {
    private Obdlznik grafika;
    
    private int poziciaY;
    
    public Pad(boolean pravyPod) {
        this.grafika = new Obdlznik();
        
        this.grafika.zmenStrany(5, 50);
        
        this.grafika.posunZvisle(75);
        
        this.poziciaY = 150;
        
        if (pravyPod) {
            this.grafika.posunVodorovne(235);
        } else {
            this.grafika.posunVodorovne(-60);
        }
        
        this.grafika.zobraz();
    }
    
    public void posunDole() {
        if (this.poziciaY <= 270) {
            this.grafika.posunZvisle(5);
            this.poziciaY += 5;
        }
    }
    
    public void posunHore() {
        if (this.poziciaY >= 30) {
            this.grafika.posunZvisle(-5);
            this.poziciaY -= 5;
        }
    }
}
