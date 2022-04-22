package practicaMona;

public class Spectrocat extends MonaOctocat{

    private boolean isAlive;
    private boolean isWhite;

    public Spectrocat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL, boolean isAlive, boolean isWhite) {
        super(nTentaculos, nBigotes, nOrejas, cOjos, imgURL);
        this.isAlive = isAlive;
        this.isWhite = isWhite;
    }

    public boolean isAlive() {  return isAlive;  }
    public boolean isWhite() {  return isWhite;  }

    @Override
    public String toString() {
        String s = toStringMona();
        return "\n [ Spectrocat ] "+s+"\n isAlive: " + isAlive + "\n isWhite: " + isWhite +"\n}";
    }

}/*Spectrocat*/
