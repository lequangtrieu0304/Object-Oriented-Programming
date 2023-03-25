package entities;

public class Document {
    private String id;
    private String nxb;
    private int numberPublish;

    public Document(String id, String nxb, int numberPublish) {
        this.id = id;
        this.nxb = nxb;
        this.numberPublish = numberPublish;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumberPublish() {
        return numberPublish;
    }

    public void setNumberPublish(int numberPublish) {
        this.numberPublish = numberPublish;
    }
}
