package practicaHarry;

public class severusSnape {
    public static void main(String[] args) {
        createCharacter();
    }
    public static void createCharacter(){
        Wizard ss = new Wizard();
        ss.setName("Severus Snape");
        ss.setGenre("Male");
        ss.setHouseOfHowarts("Slytherin");
        ss.setBoggart("Lord Voldemort");
        ss.setPatronus("Deer");
        System.out.println(ss.showWizard());
    }/*createCharacter*/
}/*severusSnape*/
