import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GeneratorTetromin {
    private ArrayList<boolean[][]> tvary;
    
    public GeneratorTetromin() throws IOException {
        this.tvary = new ArrayList<boolean[][]>();
        
        this.nacitajTvaryZoSuboru();
    }
    
    private void nacitajTvaryZoSuboru() throws IOException {
        File subor = new File("tetrominoes.txt");
        
        Scanner citac = new Scanner(subor);
        
        while (citac.hasNextLine()) {
            int sirka = citac.nextInt();
            int vyska = citac.nextInt();
            
            citac.nextLine(); // preskoc zvysok riadku po rozmeroch
            
            boolean[][] polickoSvieti = new boolean[vyska][sirka];
            
            for (int y = 0; y < vyska; y++) {
                String riadok = citac.nextLine();
                for (int x = 0; x < sirka; x++) {
                    char znak = riadok.charAt(x);
                    
                    if (znak == '*') {
                        polickoSvieti[y][x] = true;
                    }
                }
            }
            
            this.tvary.add(polickoSvieti);
        }
        
        citac.close();
    }
    
    public Tetromino vytvorNahodne() {
        Random nahodneCisla = new Random();
        
        int indexTvaru = nahodneCisla.nextInt(this.tvary.size());
        boolean[][] polickoSvieti = this.tvary.get(indexTvaru);
        
        return new Tetromino(polickoSvieti);
    }
}
