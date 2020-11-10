public class Ucet {
    private String iban;
    private String menoMajitela;
    private long sumaVCentoch;
    
    public Ucet(String iban, String menoMajitela) {
        this.iban = iban;
        this.menoMajitela = menoMajitela;
        this.sumaVCentoch = 0;
    }
    
    public String getIban() {
        return this.iban;
    }
    
    public void vyber(int eur, int centov) {
        if (centov < 100) {
            if (eur >= 0 && centov >= 0) {
                if (eur * 100 + centov <= this.sumaVCentoch) {
                    this.sumaVCentoch -= eur * 100 + centov;
                }
            }
        }
    }
    
    public void vloz(int eur, int centov) {
        if (centov < 100) {
            if (eur >= 0 && centov >= 0) {
                this.sumaVCentoch += eur * 100 + centov;
            }
        }
    }
    
    public String getStavUctu() {
        return String.format("%d,%02d €", this.sumaVCentoch / 100, this.sumaVCentoch % 100);
    }
}
