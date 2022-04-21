package practicaHarry;

public class hermioneGranger {
    public static void main(String[] args) {
        createCharacter();
    }
    public static void createCharacter(){
        Wizard hg = new Wizard();
        hg.setName("Hermione Jean Granger");
        hg.setGenre("Female");
        hg.setHouseOfHowarts("Gryffindor");
        hg.setBoggart("Failure");
        hg.setPatronus("Otter");
        System.out.println(hg.showWizard());
    }/*createCharacter*/
}/*hermioneGranger*/
