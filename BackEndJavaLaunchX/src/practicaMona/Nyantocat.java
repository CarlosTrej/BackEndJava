package practicaMona;

public class Nyantocat extends MonaOctocat{

    private boolean hasRainbown;
    private boolean hasCracketBody;

    public Nyantocat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL, boolean hasCracketBody, boolean hasRainbown) {
        super(nTentaculos, nBigotes, nOrejas, cOjos, imgURL);
        this.hasCracketBody = hasCracketBody;
        this.hasRainbown = hasRainbown;
    }

    public boolean getRainbown() {  return hasRainbown;  }
    public boolean getCracketBody() {  return hasCracketBody;  }

    @Override
    public String toString() {
        String s = toStringMona();
        return "\n [ Nyantocat ] "+s+"\n hasRainbown: " + hasRainbown+ "\n hasCracketBody: " + hasCracketBody +  "\n}";
    }

}/*Nyantocat*/
