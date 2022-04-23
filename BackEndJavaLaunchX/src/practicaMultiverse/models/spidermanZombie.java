package practicaMultiverse.models;

import imonsh.Screen;
import practicaMultiverse.Spiderman;
import practicaMultiverse.service.ActionsSZombie;

import java.awt.*;

public class spidermanZombie extends Spiderman implements ActionsSZombie {
    public spidermanZombie(String name, String description, int arms, int legs, boolean auntMay) {
        super(name, description, arms, legs, auntMay);
    }/*spidermanZombie*/

    @Override
    public void superSpeed(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I run very fast!","Helvetica",28, Color.GREEN);
    }/*superSpeed*/

    @Override
    public void humanFleshSense(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I smell human flesh far away!","Helvetica",28, Color.GREEN);
    }/*humanFleshSense*/

    @Override
    public void selfCure(Screen s) {
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out("I can't die!","Helvetica",28, Color.GREEN);
    }/*selfCure*/
}/*spidermanZombie*/
