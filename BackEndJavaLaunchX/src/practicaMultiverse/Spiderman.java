package practicaMultiverse;

public class Spiderman {

    private String name;
    private String description;
    private int arms;
    private int legs;
    private boolean auntMay;

    public Spiderman(String name, String description, int arms, int legs, boolean auntMay){
        this.name = name;
        this.description = description;
        this.arms = arms;
        this.legs = legs;
        this.auntMay = auntMay;
    }/*Spiderman*/

    public String getName() {  return name;  }
    public String getDescription(){  return description;  }
    public int getArms(){  return arms;  }
    public int getLegs(){ return legs;  }
    public boolean isAuntMay(){  return auntMay;  }

    public String showDetails(){
        return "[\n name: "+name+"" +
                "\n description: "+description+"" +
                "\n arms: "+arms+"" +
                "\n legs: "+legs+"" +
                "\n have aunt May: "+auntMay+"" +
                "\n]\n";
    }
}/*Spiderman*/
