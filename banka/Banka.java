public class Banka {
    public Ucet zalozUcet(String menoMajitela) {
        String iban = "SK90 1100 0000 0026 0000 0126";
        
        return new Ucet(iban, menoMajitela);
    }
}
