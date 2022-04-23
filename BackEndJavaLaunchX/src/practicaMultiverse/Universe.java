package practicaMultiverse;

import imonsh.Screen;
import practicaMultiverse.models.spidermanAiApaec;
import practicaMultiverse.models.spidermanWoman;
import practicaMultiverse.models.spidermanZombie;

import java.awt.*;

public class Universe {

    public static void main(String[] args) {
        Runnable character = new Runnable() {
            @Override
            public void run() {
                try{
                    testSpidermanW();
                    Thread.sleep(7000);
                    testSpidermanAi();
                    Thread.sleep(7000);
                    testSpidermanZ();
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(character);
        t1.start();
    }

    public static void testSpidermanW(){
        Screen s = new Screen();
        spidermanWoman sw = new spidermanWoman("Gwen Stacy","The character is a Spider-Man variant, an alternate universe version of Gwen Stacy. She resides on \"Earth-65\", where, instead of Peter Parker, Gwen Stacy was bitten by the radioactive spider, leading her on a career as the Spider-Woman of her world. ",2,2,false);
        s.setVisible(true);
        s.out(sw.showDetails(),"Helvetica",20,Color.CYAN);
        s.setBounds(200,100,900,800);
        s.showImage("swoman.jpg");
    }/*testSpidermanW*/

    public static void testSpidermanAi(){
        Screen s = new Screen();
        spidermanAiApaec sa = new spidermanAiApaec("Ai Apaec","Ai Apaec the Decapitator was a god worshiped by the Moche people of Peru in South America. Ai Apaec is a powerful, chimeric being who resembles a man with the lower body of a spider, snakes for hair, and long sharp teeth.",6,2,false);
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(sa.showDetails(),"Helvetica",20,Color.RED);
        s.setBounds(200,100,900,800);
        s.showImage("sai.jpg");
    }/*testSpidermanAi*/

    public static void testSpidermanZ(){
        Screen s = new Screen();
        spidermanZombie sz = new spidermanZombie("Peter Benjamin Parker","His skin went through a process of accelerated putrefaction, he vomited gastric acid into his mask, causing it to degrade from the acid, and he fell to the ground.",2,2,false);
        s.cls();
        s.repaint();
        s.setVisible(true);
        s.out(sz.showDetails(),"Helvetica",20,Color.GREEN);
        s.setBounds(200,100,900,800);
        s.showImage("szombie.jpg");
    }/*testSpidermanZ*/

}/*Universe*/
