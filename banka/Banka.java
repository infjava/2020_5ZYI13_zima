import java.util.Random;
import java.math.BigInteger;

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
        
        int pism1 = this.kodKrajiny.charAt(0) - 'A' + 10;
        int pism2 = this.kodKrajiny.charAt(1) - 'A' + 10;
        
        BigInteger ibanPreKontrolu = new BigInteger(String.format("%s000000%010d%02d%02d00", this.kodBanky, bban, pism1, pism2));
        
        int kontrolnaCislica = 98 - ibanPreKontrolu.mod(new BigInteger("97")).intValue();
        
        String iban = String.format("%s%02d%s000000%010d", this.kodKrajiny, kontrolnaCislica, this.kodBanky, bban);
        
        return new Ucet(iban, menoMajitela);
    }
}
