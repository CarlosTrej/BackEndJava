package practicaHarry;

public class lVoldemort {
    public static void main(String[] args) {
       createCharacter();
    }
    public static void createCharacter(){
        Wizard lv = new Wizard();
        lv.setName("Tom Marvolo Riddle");
        lv.setGenre("Male");
        lv.setHouseOfHowarts("Slytherin");
        lv.setBoggart("His own corpse");
        lv.setPatronus("None");
        System.out.println(lv.showWizard());
    }/*createCharacter*/
}/*lVoldemort*/
