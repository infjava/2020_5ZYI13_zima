public class Tetromino {
    private int poziciaX;
    private int poziciaY;
    
    private boolean[][] polickoSvieti;
    
    public Tetromino(boolean[][] polickoSvieti) {
        this.polickoSvieti = polickoSvieti;
        
        this.poziciaX = (Displej.SIRKA - this.polickoSvieti[0].length) / 2;
        this.poziciaY = 0;
    }
    
    public void posunVlavo() {
        this.zmaz();
        this.poziciaX--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        this.zmaz();
        this.poziciaX++;
        this.nakresli();
    }
    
    public void zmaz() {
        for (int y = 0; y < this.polickoSvieti.length; y++) {
            for (int x = 0; x < this.polickoSvieti[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.nastav(x + this.poziciaX, y + this.poziciaY, false);
            }
        }
    }
    
    public void nakresli() {
        for (int y = 0; y < this.polickoSvieti.length; y++) {
            for (int x = 0; x < this.polickoSvieti[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.nastav(x + this.poziciaX, y + this.poziciaY, this.polickoSvieti[y][x]);
            }
        }
    }
}
