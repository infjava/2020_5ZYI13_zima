import java.util.Random;

public class Pokus {
    private boolean hracMeniVyber;
    private Sutaz sutaz;
    
    public Pokus(boolean hracMeniVyber) {
        this.hracMeniVyber = hracMeniVyber;
        this.sutaz = new Sutaz();
    }
    
    public void vykonajPokus() {
        Random nahodneCisla = new Random();
        
        this.sutaz.vyberDvere(nahodneCisla.nextInt(3));
        
        int dvere;
        do {
            dvere = nahodneCisla.nextInt(3);
        } while (!this.sutaz.dvereSaDajuOtvorit(dvere));
        
        this.sutaz.otvorDvere(dvere);
        if (this.hracMeniVyber) {
            do {
                dvere = nahodneCisla.nextInt(3);
            } while (!this.sutaz.dvereSaDajuVybrat(dvere));
            
            this.sutaz.vyberDvere(dvere);
        }
    }
    
    public boolean jeVyhra() {
        return this.sutaz.jeVyhra();
    }
}
