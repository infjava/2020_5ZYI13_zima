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
}
