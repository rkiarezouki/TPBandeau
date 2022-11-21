package exemple;
 import bandeau.Bandeau;
import java.awt.*;

public class TypeWritterText extends AbstractEffet{
    private String text;
    private int duration;
    private Color color1;
    private Color color2;
    private int additionnalDuration;


    public TypeWritterText (Bandeau bandeau, int delay , String text, int duration, Color color1, Color color2, int additionnaleDuration ){
        super(bandeau, delay);
        this.text = text;
        this.duration = duration;
        this.color1 = color1;
        this.additionnalDuration = additionnaleDuration;

    }

    public void execute(){

        this.bandeau.sleep(this.delay);
        this.bandeau.setForeground(color2);
        this.bandeau.setBackground(color1);
        for( int i = 0; i < text.length()+1;i++){
            this.bandeau.setMessage(text.substring(0,i)+(i-1==text.length()?"":""));
            this.bandeau.sleep(duration/text.length());
        }
    }
}
