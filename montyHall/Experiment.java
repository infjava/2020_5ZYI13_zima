public class Experiment {
    private int pocetOpakovani;
    private int pocetVyhier;
    private boolean hracMeniVyber;
    
    public Experiment(int pocetOpakovani, boolean hracMeniVyber) {
        this.pocetOpakovani = pocetOpakovani;
        this.hracMeniVyber = hracMeniVyber;
        this.pocetVyhier = 0;
    }
    
    public void vykonaj() {
        for (int i = 0; i < this.pocetOpakovani; i++) {
            Pokus pokus = new Pokus(this.hracMeniVyber);
            pokus.vykonajPokus();
            if (pokus.jeVyhra()) {
                this.pocetVyhier++;
            }
        }
    }
    
    public int getPocetVyhier() {
        return this.pocetVyhier;
    }
}
