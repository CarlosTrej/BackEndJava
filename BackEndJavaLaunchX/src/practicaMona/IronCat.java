package practicaMona;

public class IronCat extends MonaOctocat{

    private boolean hasArmor;
    private int thrusters;

    public IronCat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL,boolean hasArmor,int thrusters){
        super(nTentaculos, nBigotes, nOrejas, cOjos, imgURL);
        this.hasArmor = hasArmor;
        this.thrusters = thrusters;
    }

    public boolean getHasArmor() {  return hasArmor;  }
    public int getThrusters() {  return thrusters;  }

    @Override
    public String toString() {
        String s = toStringMona();
        return "\n [ IronCat ] "+s+"\n hasArmor: " + hasArmor+ "\n thrusters: " + thrusters +  "\n}";
    }

}/*IronCat*/
