public class Flat extends Envelope {
    private String contents;

    public Flat() {
        this.contents = "";
    }

    public Flat(String deliveryAddress, String returnAddress, double width, double length, double thickness, String contents) {
        super(deliveryAddress, returnAddress, width, length, thickness);
        this.contents = contents;
    }
    public String getContents() {
        return contents;
    }
}