public class Pad {
    private Obdlznik grafika;
    
    private int poziciaY;
    private int poziciaX;
    
    public Pad(boolean pravyPod) {
        this.grafika = new Obdlznik();
        
        this.grafika.zmenStrany(6, 50);
        
        this.grafika.posunZvisle(75);
        
        this.poziciaY = 150;
        
        if (pravyPod) {
            this.grafika.posunVodorovne(234);
            this.poziciaX = 297;
        } else {
            this.grafika.posunVodorovne(-60);
            this.poziciaX = 3;
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
    
    public boolean koliduje(Lopta lopta) {
        int xLavy = this.poziciaX - 3;
        int xPravy = this.poziciaX + 3;
        int yHorny = this.poziciaY - 25;
        int yDolny = this.poziciaY + 25;
        int loptaX = lopta.getStredX();
        int loptaY = lopta.getStredY();
        
        return xLavy <= loptaX && loptaX <= xPravy && yHorny <= loptaY && loptaY <= yDolny;
    }
}
