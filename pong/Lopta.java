import java.util.Random;

public class Lopta {
    private Kruh grafika;
    
    private int poziciaX;
    private int poziciaY;
    
    private int smerX;
    private int smerY;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        this.poziciaY = nahodneCisla.nextInt(281) + 10;
        this.poziciaX = 150;
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(this.poziciaY - 65);
        
        if (nahodneCisla.nextBoolean()) {
            this.smerX = +10;
        } else {
            this.smerX = -10;
        }
        
        if (nahodneCisla.nextBoolean()) {
            this.smerY = +10;
        } else {
            this.smerY = -10;
        }
        
        this.grafika.zobraz();
    }
    
    public void posun() {
        if (this.poziciaY < 6 || this.poziciaY > 294) {
            this.smerY = -this.smerY;
        }
        
        this.grafika.skry();
        
        this.grafika.posunVodorovne(this.smerX);
        this.grafika.posunZvisle(this.smerY);
        
        this.poziciaY += this.smerY;
        this.poziciaX += this.smerX;
        
        this.grafika.zobraz();
    }
    
    public int getStredX() {
        return this.poziciaX;
    }
    
    public int getStredY() {
        return this.poziciaY;
    }
    
    public void odrazX() {
        this.smerX = -this.smerX;
    }
    
    public boolean jeMimoObrazovky() {
        return this.poziciaX < 0 || this.poziciaX > 300;
    }
    
    public void umiestni() {
        Random nahodneCisla = new Random();
        
        int novaPoziciaY = nahodneCisla.nextInt(281) + 10;
        int novaPoziciaX = 150;
        
        int posunX = novaPoziciaX - this.poziciaX;
        int posunY = novaPoziciaY - this.poziciaY;
        
        this.grafika.posunZvisle(posunY);
        this.grafika.posunVodorovne(posunX);
        
        this.poziciaX = novaPoziciaX;
        this.poziciaY = novaPoziciaY;
        
        if (nahodneCisla.nextBoolean()) {
            this.smerX = +10;
        } else {
            this.smerX = -10;
        }
        
        if (nahodneCisla.nextBoolean()) {
            this.smerY = +10;
        } else {
            this.smerY = -10;
        }
    }
}
