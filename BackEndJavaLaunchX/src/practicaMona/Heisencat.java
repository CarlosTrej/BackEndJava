package practicaMona;

public class Heisencat extends MonaOctocat{

    private int boots;
    private String colorSuit;
    private boolean hasglass;
    private String tool;

    public Heisencat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL, int boots, String colorSuit, boolean hasglass, String tool) {
        super(nTentaculos, nBigotes, nOrejas, cOjos, imgURL);
        this.boots = boots;
        this.colorSuit = colorSuit;
        this.hasglass = hasglass;
        this.tool = tool;
    }

    public int getBoots() {  return boots;  }
    public String getColorSuit() {  return colorSuit;  }
    public boolean getglass() {  return hasglass;  }
    public String getTool() {  return tool;  }

    @Override
    public String toString() {
        String s = toStringMona();
        return "\n [ Heisencat ] "+s+"\n boots: " + boots + "\n Color suit: " + colorSuit + "\n has glass: " + hasglass+ "\n tool: "+tool+"\n}";
    }

}/*Heisencat*/
