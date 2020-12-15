public class Tetris {
    private Tetromino padajuce;
    private int cisloTiku;
    
    public Tetris() {
        this.padajuce = new Tetromino(
            new boolean[][] {
                {true, false},{true, false},{true,true}
            }
        );
        
        this.cisloTiku = 0;
        
        new Manazer().spravujObjekt(this);
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
        }
    }
    
    public void aktivuj() {
        this.padajuce.otoc();
    }
}
