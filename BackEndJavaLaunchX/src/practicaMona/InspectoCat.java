package practicaMona;

public class InspectoCat extends MonaOctocat{
    private boolean hasHad;
    private boolean hasAMagnifier;
    private boolean hasARaincoat;

    public InspectoCat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL, boolean hasHad, boolean hasAMagnifier, boolean hasARaincoat) {
        super(nTentaculos,nBigotes,nOrejas,cOjos,imgURL);
        this.hasAMagnifier = hasAMagnifier;
        this.hasHad = hasHad;
        this.hasARaincoat = hasARaincoat;
    }

    public boolean isHasHad() {  return hasHad;  }
    public boolean isHasAMagnifier() {  return hasAMagnifier;  }
    public boolean isHasARaincoat() {  return hasARaincoat;  }

    public void research(){
        System.out.println("InspectoCat likes research cases.");
    }/*research*/

    @Override
    public String toString() {
        String s = toStringMona();
        return "\n [ InspectoCat ] "+s+"\n hasHad: " + hasHad + "\n hasAMagnifier: " + hasAMagnifier + "\n hasARaincoat: " + hasARaincoat + "\n}";
    }
}
