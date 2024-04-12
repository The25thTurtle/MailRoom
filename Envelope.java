public abstract class Envelope extends Mail {
    private double thickness;

    public Envelope () {
        super();
        this.thickness = 0.0;
    }
    public Envelope (String deliveryAddress, String returnAddress, double width, double length, double thickness) {
        super(deliveryAddress, returnAddress, width, length);
        this.thickness = thickness;
    }
    public double getThickness() {
        return thickness;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+getWidth()+" x "+getLength()+" x "+thickness;
    }
}