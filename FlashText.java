package exemple;


import bandeau.Bandeau;

import java.awt.Color;
public class FlashText extends AbstractEffet{
    private String text;
    private int duration;
    private Color color1;
    private Color color2;

    public FlashText(Bandeau bandeau, int delay, String text, Color color1, Color color2){
        super(bandeau, delay);
        this.text = text;
        this.duration = duration;
        this.color1 = color1;
        this.color2 = color2;
    }

     public void execute(){
        this.bandeau.sleep(this.delay);
        this.bandeau.setMessage(text);
        this.bandeau.setForeground(color2);
        this.bandeau.setBackground(color1);
     }
}
