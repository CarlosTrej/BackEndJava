package practicaHarry;

public class ronWeasley {
    public static void main(String[] args) {
        createCharacter();
    }
    public static void createCharacter(){
        Wizard rw = new Wizard();
        rw.setName("Ronald Bilius Weasley");
        rw.setGenre("Male");
        rw.setHouseOfHowarts("Gryffindor");
        rw.setBoggart("Aragog");
        rw.setPatronus("Jack Russel Terrier");
        System.out.println(rw.showWizard());
    }/*createCharacter*/
}/*ronWeasley*/
