public class Tetromino {
    private int poziciaX;
    private int poziciaY;
    
    private boolean[][] polickoSvieti;
    
    public Tetromino(boolean[][] polickoSvieti) {
        this.polickoSvieti = polickoSvieti;
        
        this.poziciaX = (Displej.SIRKA - this.polickoSvieti[0].length) / 2;
        this.poziciaY = 0;
        
        this.nakresli();
    }
    
    public void posunVlavo() {
        if (this.poziciaX <= 0) {
            return;
        }
        
        this.zmaz();
        this.poziciaX--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        if (this.poziciaX + this.polickoSvieti[0].length >= Displej.SIRKA) {
            return;
        }
        
        this.zmaz();
        this.poziciaX++;
        this.nakresli();
    }
    
    public void posunDole() {
        if (this.poziciaY + this.polickoSvieti.length >= Displej.VYSKA) {
            return;
        }
        
        this.zmaz();
        this.poziciaY++;
        this.nakresli();
    }
    
    public void otoc() {
        int staraSirka = this.polickoSvieti[0].length;
        int staraVyska = this.polickoSvieti.length;
        int novaSirka=staraVyska;
        int novaVyska=staraSirka;
        
        boolean[][] novePolicka = new boolean[novaVyska][novaSirka];
        
        for (int staraY = 0; staraY < staraVyska; staraY++) {
            for (int staraX = 0; staraX < staraSirka; staraX++) {
                int novaX = staraY;
                int novaY = staraSirka - 1 - staraX;
                
                novePolicka[novaY][novaX] = this.polickoSvieti[staraY][staraX];
            }
        }
        
        this.zmaz();
        
        if (this.poziciaX + novaSirka > Displej.SIRKA) {
            this.poziciaX = Displej.SIRKA - novaSirka;
        }
        
        if (this.poziciaY + novaVyska > Displej.VYSKA) {
            this.poziciaY = Displej.VYSKA - novaVyska;
        }
        
        this.polickoSvieti = novePolicka;
        this.nakresli();
    }
    
    public boolean jeDole() {
        return this.poziciaY + this.polickoSvieti.length >= Displej.VYSKA;
    }
    
    private void zmaz() {
        for (int y = 0; y < this.polickoSvieti.length; y++) {
            for (int x = 0; x < this.polickoSvieti[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.nastav(x + this.poziciaX, y + this.poziciaY, false);
            }
        }
    }
    
    private void nakresli() {
        for (int y = 0; y < this.polickoSvieti.length; y++) {
            for (int x = 0; x < this.polickoSvieti[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.nastav(x + this.poziciaX, y + this.poziciaY, this.polickoSvieti[y][x]);
            }
        }
    }
}
