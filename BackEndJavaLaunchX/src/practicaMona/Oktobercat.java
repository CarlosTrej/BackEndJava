package practicaMona;

public class Oktobercat extends MonaOctocat{

    private int nBeers;
    private boolean hasGermanyHad;
    private int shoes;

    public Oktobercat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL,int nBeers, boolean hasGermanyHad, int shoes) {
        super(nTentaculos, nBigotes, nOrejas, cOjos, imgURL);
        this.nBeers = nBeers;
        this.hasGermanyHad = hasGermanyHad;
        this.shoes = shoes;
    }

    public int getnBeers() {  return nBeers;  }
    public boolean isHasGermanyHad() {  return hasGermanyHad;  }
    public int getShoes() {  return shoes;  }

    @Override
    public String toString() {
        String s = toStringMona();
        return "\n [ Oktobercat ] "+s+"\n nBeers: " + nBeers + "\n hasGermanyHad: " + hasGermanyHad +"\n shoes: "+shoes+"\n}";
    }

}/*Oktobercat*/
