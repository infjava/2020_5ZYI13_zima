import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;

public class Banka {
    private String kodKrajiny;
    private String kodBanky;
    private ArrayList<Ucet> ucty;
    
    public Banka(String kodKrajiny, String kodBanky) {
        this.kodKrajiny = kodKrajiny;
        this.kodBanky = kodBanky;
        this.ucty = new ArrayList<Ucet>();
    }
    
    public Ucet zalozUcet(String menoMajitela) {
        Random nahodneCisla = new Random();
        
        // bban moze byt 0000000000 az 9999999999
        long bban = Math.abs(nahodneCisla.nextLong()) % 10000000000L;
        
        int pism1 = this.kodKrajiny.charAt(0) - 'A' + 10;
        int pism2 = this.kodKrajiny.charAt(1) - 'A' + 10;
        
        BigInteger ibanPreKontrolu = new BigInteger(String.format("%s000000%010d%02d%02d00", this.kodBanky, bban, pism1, pism2));
        
        int kontrolnaCislica = 98 - ibanPreKontrolu.mod(new BigInteger("97")).intValue();
        
        String iban = String.format("%s%02d%s000000%010d", this.kodKrajiny, kontrolnaCislica, this.kodBanky, bban);
        
        Ucet ucet = new Ucet(this, iban, menoMajitela);
        this.ucty.add(ucet);
        return ucet;
    }
    
    public void zaratajUroky(double percenta) {
        for (Ucet aktualny : this.ucty) {
            aktualny.vlozUroky(percenta);
        }
    }
    
    public Ucet getUcet(String iban) {
        for (Ucet aktualny : this.ucty) {
            if (aktualny.getIban().equals(iban)) {
                return aktualny;
            }
        }
        
        return null;
    }
}
