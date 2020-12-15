public class Tetris {
    private Tetromino padajuce;
    
    public Tetris() {
        this.padajuce = new Tetromino(
            new boolean[][] {
                {true, false},{true, false},{true,true}
            }
        );
        
        new Manazer().spravujObjekt(this);
    }
    
    public void posunVlavo() {
        this.padajuce.posunVlavo();
    }
    
    public void posunVpravo() {
        this.padajuce.posunVpravo();
    }
    
    public void tik() {
        this.padajuce.posunDole();
    }
    
    public void aktivuj() {
        this.padajuce.otoc();
    }
}
