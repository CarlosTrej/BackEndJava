package practicaHarry;

public class Wizard {

    private String houseOfHowarts;
    private String genre;
    private String name;
    private String boggart;
    private String patronus;

    public String getHouseOfHowarts(){  return houseOfHowarts;  }
    public String getGenre(){  return genre;  }
    public String getName(){  return  name;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    public boolean setHouseOfHowarts(String houseOfHowarts){
        if(!houseOfHowarts.isEmpty()){
            this.houseOfHowarts = houseOfHowarts;
            return true;
        }else
            return false;
    }/*setHouseOfHowarts*/

    public boolean setGenre(String genre){
        if(!genre.isEmpty()){
            this.genre = genre;
            return true;
        }else
            return false;
    }/*setGenre*/

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }/*setName*/

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }/*setBoggart*/

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }/*setPatronus*/

    public String showWizard(){
        return "\nname -> "+name+"\n{ " +
                "House of howards: "+houseOfHowarts+"\n " +
                "Genre: "+genre+"\n " +
                "Boggart: "+boggart+"\n " +
                "Patronus: "+patronus+"\n}";
    }
}/*Wizard*/
