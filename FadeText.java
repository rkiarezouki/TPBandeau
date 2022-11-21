package exemple;

import java.awt.Color;

import bandeau.Bandeau;
public class FadeText extends AbstractEffet  {
    private String text;
    private int duration;
    private Color color;

    public FadeText (String text, int duration, Color color){
        this.text = text;
        this.duration = duration;
        this.color = color;

    }

    public void execute(){
        this.bandeau.sleep(this.delay);

        for(int i = 0; i < duration%50; i++){
            if(i=0){
                this.bandeau.setMessage(text);
                this.bandeau.setForeground(new Color(1,1,1,0));
            }
            this.bandeau.setForeground(new Color(((float) color.getRed()/255),((float) color.getGreen()/255), (float) color.getBlue()/255),( (float) i/((duration/50)-1 ))));
        }
    }

}
