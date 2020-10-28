import java.util.Random;

public class Lopta {
    private Kruh grafika;
    
    private int smerX;
    private int smerY;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        
        this.grafika = new Kruh();
        
        this.grafika.zmenPriemer(10);
        
        int poziciaY = nahodneCisla.nextInt(281) + 10;
        
        this.grafika.posunVodorovne(125);
        this.grafika.posunZvisle(poziciaY - 65);
        
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
        this.grafika.skry();
        
        this.grafika.posunVodorovne(this.smerX);
        this.grafika.posunZvisle(this.smerY);
        
        this.grafika.zobraz();
    }
}
