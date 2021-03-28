package pl.gda.wsb.devices;

public class Phone {
    public String brand;
    public int height;
    public int wide;
    public boolean haveCamera;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", height=" + height +
                ", wide=" + wide +
                ", haveCamera=" + haveCamera +
                '}';
    }
}
