import java.util.Random;

public class Sutaz {
    private Dvere[] dvere;
    
    public Sutaz() {
        Random nahodneCisla = new Random();
        this.dvere = new Dvere[3];
        int vyherneDvere = nahodneCisla.nextInt(3);
        for (int i = 0; i < 3; i++) {
            this.dvere[i] = new Dvere(i == vyherneDvere);
        }
    }
    
    public void vyberDvere(int cislo) {
        for (Dvere dvere : this.dvere) {
            dvere.zrusVyber();
        }
        
        this.dvere[cislo].vyber();
    }
    
    public void otvorDvere(int cislo) {
        this.dvere[cislo].otvor();
    }
}
