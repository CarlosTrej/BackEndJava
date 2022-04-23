package practicaMultiverse.models;

import imonsh.Screen;
import practicaMultiverse.Spiderman;
import practicaMultiverse.service.ActionsSApaec;

import java.awt.*;

public class spidermanAiApaec extends Spiderman implements ActionsSApaec {
    public spidermanAiApaec(String name, String description, int arms, int legs, boolean auntMay) {
        super(name, description, arms, legs, auntMay);
    }/*spidermanAiApaec*/

    @Override
    public void regenerate(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I can regenerate!","Helvetica",28, Color.DARK_GRAY);
    }/*regenerate*/

    @Override
    public void poisonBite(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I bite!!","Helvetica",28, Color.DARK_GRAY);
    }/*poisonBite*/

    @Override
    public void underWater(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I can to live under water!","Helvetica",28, Color.DARK_GRAY);
    }/*underWater*/
}/*spidermanAiApaec*/
