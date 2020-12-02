import java.util.Random;

public class Nim {
    private Kamen kamen;
    private String[] menaHracov;
    private boolean prvyNaTahu;
    private String menoVyhercu;
    
    public Nim(int sirka, int vyska, String menoPrveho, String menoDruheho) {
        Sachovnica sachovnica = new Sachovnica(sirka, vyska);
        this.kamen = sachovnica.vytvorKamen();
        sachovnica.zobraz();
        this.menaHracov = new String[] {menoPrveho, menoDruheho};
        this.prvyNaTahu = true;
        this.menoVyhercu = null;
        
        if (this.getHracNaTahu().equals("PC")) {
            this.tahPocitaca();
        }
    }
    
    public String getMenoVyhercu() {
        return this.menoVyhercu;
    }
    
    public String getHracNaTahu() {
        if (this.prvyNaTahu) {
            return this.menaHracov[0];
        } else {
            return this.menaHracov[1];
        }
    }
    
    public void posunDole(int oKolko) {
        this.posun(0, oKolko);
    }

    public void posunVlavo(int oKolko) {
        this.posun(oKolko, 0);
    }
    
    private void posun(int oKolkoStlpcov, int oKolkoRiadkov) {
        if (oKolkoStlpcov <= 0 && oKolkoRiadkov <= 0) {
            System.out.println("Musis tahat o kladny pocet policok");
            return;
        }
        int stlpec = this.kamen.getPoziciaStlpec() - oKolkoStlpcov;
        int riadok = this.kamen.getPoziciaRiadok() - oKolkoRiadkov;
        if (riadok < 1) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        if (stlpec < 1) {
            System.out.println("Snazis sa vybehnut zo sachovnice");
            return;
        }
        this.kamen.posunSa(riadok, stlpec);
        
        if (this.kamen.getPoziciaRiadok() == 1 && this.kamen.getPoziciaStlpec() == 1) {
            this.menoVyhercu = this.getHracNaTahu();
        }
        
        this.prvyNaTahu = !this.prvyNaTahu;
        
        if (this.getHracNaTahu().equals("PC") && this.menoVyhercu == null) {
            this.tahPocitaca();
        }
    }
    
    private void tahPocitaca() {
        Random nahodneCisla = new Random();
        int stlpec = this.kamen.getPoziciaStlpec();
        int riadok = this.kamen.getPoziciaRiadok();
        
        if (stlpec < riadok) {
            this.posunDole(riadok - stlpec);
        } else if (stlpec > riadok) {
            this.posunVlavo(stlpec - riadok);
        } else if (stlpec > 2) {
            if (nahodneCisla.nextBoolean()) {
                this.posunDole(nahodneCisla.nextInt(riadok - 2) + 1);
            } else {
                this.posunVlavo(nahodneCisla.nextInt(stlpec - 2) + 1);
            }
        } else {
            if (nahodneCisla.nextBoolean()) {
                this.posunDole(1);
            } else {
                this.posunVlavo(1);
            }
        }
    }
}
