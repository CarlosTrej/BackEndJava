package practicaMona;

public class Main {
    public static void main(String[] args) {
        createMona();
    }

    public static void createMona(){

        Heisencat heisencat = new Heisencat(5,4,2,"brown","https://octodex.github.com/heisencat/",4,"yellow, true",true,"Hammer");
        System.out.println(heisencat.toString());

        InspectoCat inspectoCat = new InspectoCat(5,4,2,"brown","https://octodex.github.com/inspectocat/",true,true,true);
        System.out.println(inspectoCat.toString());

        IronCat ironCat = new IronCat(5,4,2,"brown","https://octodex.github.com/ironcat/",true,5);
        System.out.println(ironCat.toString());

        Nyantocat nyantocat = new Nyantocat(5,4,2,"brown","https://octodex.github.com/nyantocat/",true,true);
        System.out.println(nyantocat.toString());

        Oktobercat oktobercat = new Oktobercat(5,4,2,"brown","https://octodex.github.com/oktobercat/",3,true,3);
        System.out.println(oktobercat.toString());

        Spectrocat spectrocat = new Spectrocat(5,4,2,"brown","https://octodex.github.com/spectrocat/",false,true);
        System.out.println(spectrocat.toString());


    }/*createMona*/
}
