package practicaMona;

public class MonaOctocat {

    private int nTentaculos;
    private int nBigotes;
    private int nOrejas;
    private String cOjos;
    private String imgURL;

    public MonaOctocat(int nTentaculos, int nBigotes, int nOrejas, String cOjos, String imgURL) {
        this.nTentaculos = nTentaculos;
        this.nBigotes = nBigotes;
        this.nOrejas = nOrejas;
        this.cOjos = cOjos;
        this.imgURL = imgURL;
    }

    public int getnTentaculos(){  return nTentaculos;  }
    public int getnBigotes(){  return nBigotes;  }
    public int getnOrejas(){  return nOrejas;  }
    public String getcOjos(){  return cOjos;  }
    public String getImgURL(){  return imgURL;  }

    public String toStringMona() {
        return "\n{\n nTentaculos : " + nTentaculos + "\n Bigotes: " + nBigotes + "\n nOrejas: " + nOrejas + "\n cOjos: " + cOjos +"\n imgURL: " + imgURL + "";
    }
}/*MonaOctocat*/
