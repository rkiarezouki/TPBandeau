package exemple;
import  bandeau.Bandeau;
public abstract class AbstractEffet {
    protected Bandeau bandeau;
    protected int delay;

    public AbstractEffet(Bandeau bandeau, int delay){
        this.bandeau = bandeau;
        this.delay = delay;
    }
        public abstract void execute();


}
