package practicaMultiverse.models;

import imonsh.Screen;
import practicaMultiverse.Spiderman;
import practicaMultiverse.service.ActionSWoman;

import java.awt.*;

public class spidermanWoman extends Spiderman implements ActionSWoman {
    public spidermanWoman(String name, String description, int arms, int legs, boolean auntMay) {
        super(name, description, arms, legs, auntMay);
    }/*spidermanWoman*/
    @Override
    public void multiverseTravel(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I am traveling through the multiverse","Helvetica",28, Color.MAGENTA);
    }/*multiverseTravel*/
}/*spidermanWoman*/
