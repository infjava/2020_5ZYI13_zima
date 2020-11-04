public class SegmentovaCislica
{
    // horizontalny segment; rozmer = 20x5
    // vertikalny segment; rozmer = 5x17
    // okraj = 2
    // medzery = 1
    
    //  XXXX   - Segment 1
    // X    X  - Segment 2, 3
    // X    X
    //  XXXX   - Segment 4
    // X    X  - Segment 5, 6
    // X    X
    //  XXXX   - Segment 7
    private Obdlznik pozadie;
    private Obdlznik segment1;
    private Obdlznik segment2;
    private Obdlznik segment3;
    private Obdlznik segment4;
    private Obdlznik segment5;
    private Obdlznik segment6;
    private Obdlznik segment7;

    public SegmentovaCislica(int x, int y)
    {
        // pociatocna pozicia obdlznika je 60, 50
        int posunX = x - 60;
        int posunY = y - 50;
        this.pozadie = new Obdlznik();
        this.pozadie.zmenFarbu("black");
        this.pozadie.zmenStrany(36, 57);
        this.pozadie.posunVodorovne(posunX);
        this.pozadie.posunZvisle(posunY);
        this.pozadie.zobraz();
        
        this.segment1 = new Obdlznik();
        this.segment1.zmenFarbu("red");
        this.segment1.zmenStrany(20, 5);
        this.segment1.posunVodorovne(8 + posunX);
        this.segment1.posunZvisle(2 + posunY);
        this.segment1.zobraz();
        
        this.segment2 = new Obdlznik();
        this.segment2.zmenFarbu("red");
        this.segment2.zmenStrany(5, 17);
        this.segment2.posunVodorovne(2 + posunX);
        this.segment2.posunZvisle(8 + posunY);
        this.segment2.zobraz();
        
        this.segment3 = new Obdlznik();
        this.segment3.zmenFarbu("red");
        this.segment3.zmenStrany(5, 17);
        this.segment3.posunVodorovne(29 + posunX);
        this.segment3.posunZvisle(8 + posunY);
        this.segment3.zobraz();
        
        this.segment4 = new Obdlznik();
        this.segment4.zmenFarbu("red");
        this.segment4.zmenStrany(20, 5);
        this.segment4.posunVodorovne(8 + posunX);
        this.segment4.posunZvisle(26 + posunY);
        this.segment4.zobraz();
        
        this.segment5 = new Obdlznik();
        this.segment5.zmenFarbu("red");
        this.segment5.zmenStrany(5, 17);
        this.segment5.posunVodorovne(2 + posunX);
        this.segment5.posunZvisle(32 + posunY);
        this.segment5.zobraz();
        
        this.segment6 = new Obdlznik();
        this.segment6.zmenFarbu("red");
        this.segment6.zmenStrany(5, 17);
        this.segment6.posunVodorovne(29 + posunX);
        this.segment6.posunZvisle(32 + posunY);
        this.segment6.zobraz();
        
        this.segment7 = new Obdlznik();
        this.segment7.zmenFarbu("red");
        this.segment7.zmenStrany(20, 5);
        this.segment7.posunVodorovne(8 + posunX);
        this.segment7.posunZvisle(50 + posunY);
        this.segment7.zobraz();
        
        this.zobraz(0);
    }
    
    public void zobraz(int hodnota)
    {
        switch (hodnota) {
            case 0:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("yellow");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("red");
                this.segment5.zmenFarbu("yellow");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("yellow");
                break;
            case 1:
                this.segment1.zmenFarbu("red");
                this.segment2.zmenFarbu("red");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("red");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("red");
                break;
            case 2:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("red");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("yellow");
                this.segment6.zmenFarbu("red");
                this.segment7.zmenFarbu("yellow");
                break;
            case 3:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("red");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("yellow");
                break;
            case 4:
                this.segment1.zmenFarbu("red");
                this.segment2.zmenFarbu("yellow");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("red");
                break;
            case 5:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("yellow");
                this.segment3.zmenFarbu("red");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("yellow");
                break;
            case 6:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("yellow");
                this.segment3.zmenFarbu("red");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("yellow");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("yellow");
                break;
            case 7:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("red");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("red");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("red");
                break;
            case 8:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("yellow");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("yellow");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("yellow");
                break;
            case 9:
                this.segment1.zmenFarbu("yellow");
                this.segment2.zmenFarbu("yellow");
                this.segment3.zmenFarbu("yellow");
                this.segment4.zmenFarbu("yellow");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("yellow");
                this.segment7.zmenFarbu("yellow");
                break;
            default:
                this.segment1.zmenFarbu("red");
                this.segment2.zmenFarbu("red");
                this.segment3.zmenFarbu("red");
                this.segment4.zmenFarbu("red");
                this.segment5.zmenFarbu("red");
                this.segment6.zmenFarbu("red");
                this.segment7.zmenFarbu("red");
                break;
        }
    }
}
