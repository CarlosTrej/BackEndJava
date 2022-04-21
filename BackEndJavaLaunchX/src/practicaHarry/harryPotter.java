package practicaHarry;

public class harryPotter {
    public static void main(String[] args) {
        createCharacter();
    }

    public static void createCharacter(){
        Wizard hp = new Wizard();
        hp.setName("Harry James Potter");
        hp.setGenre("Male");
        hp.setHouseOfHowarts("Gryffindor");
        hp.setBoggart("Dementor");
        hp.setPatronus("Stag");
        System.out.println(hp.showWizard());
    }
}/*TestCharacter*/
