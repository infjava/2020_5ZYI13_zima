import java.io.IOException;

public class Tetris {
    private GeneratorTetromin generator;
    private Tetromino padajuce;
    private int cisloTiku;
    
    public Tetris() throws IOException {
        this.generator = new GeneratorTetromin();
        
        this.padajuce = this.generator.vytvorNahodne();
        
        this.cisloTiku = 0;
    }
    
    public void posunVlavo() {
        this.padajuce.posunVlavo();
    }
    
    public void posunVpravo() {
        this.padajuce.posunVpravo();
    }
    
    public void tik() {
        this.cisloTiku++;
        if ((this.cisloTiku % 4) == 0) {
            this.padajuce.posunDole();
            
            if (this.padajuce.jeDole()) {
                this.padajuce = this.generator.vytvorNahodne();
            }
        }
    }
    
    public void aktivuj() {
        this.padajuce.otoc();
    }
    
    public void zrus() {
        System.exit(0);
    }
}
