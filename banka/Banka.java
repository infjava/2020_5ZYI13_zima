import java.util.Random;

public class Banka {
    private String kodKrajiny;
    private String kodBanky;
    
    public Banka(String kodKrajiny, String kodBanky) {
        this.kodKrajiny = kodKrajiny;
        this.kodBanky = kodBanky;
    }
    
    public Ucet zalozUcet(String menoMajitela) {
        Random nahodneCisla = new Random();
        
        // bban moze byt 0000000000 az 9999999999
        long bban = nahodneCisla.nextLong() % 10000000000L;
        
        String iban = String.format("%s90%s000000%010d", this.kodKrajiny, this.kodBanky, bban);
        
        return new Ucet(iban, menoMajitela);
    }
}
