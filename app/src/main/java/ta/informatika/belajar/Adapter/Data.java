package ta.informatika.belajar.Adapter;
/*
getter and setter
berfungsi untuk mensetting atau memberikan nilai pada varibel
 */
public class Data {
    private String indo;
    private String lampung;
    private int img;
    private int suara;
    private String keterangan;

    public Data(String indo, String lampung, int img, int suara, String keterangan) {
        this.indo = indo;
        this.lampung = lampung;
        this.img = img;
        this.suara = suara;
        this.keterangan = keterangan;
    }

    public String getIndo() {
        return indo;
    }

    public void setIndo(String indo) {
        this.indo = indo;
    }

    public String getLampung() {
        return lampung;
    }

    public void setLampung(String lampung) {
        this.lampung = lampung;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
