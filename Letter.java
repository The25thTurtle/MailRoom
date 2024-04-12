public class Letter extends Envelope {
    private String letterBody;

    public Letter () {
        super();
        this.letterBody = "";
    }
    public Letter (String deliveryAddress, String returnAddress, double width, double length, double thickness, String letterBody) {
        super(deliveryAddress, returnAddress, width, length, thickness);
        this.letterBody = letterBody;
    }
    public String getLetterBody() {
        return letterBody;
    }
}