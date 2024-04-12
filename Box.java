public abstract class Box extends Mail {
    private double height;
    private int count;

    public Box () {
        this.height = 0.0;
        this.count = 0;
    }
    public Box (String deliveryAddress, String returnAddress, double width, double length, double height, int count) {
        super(deliveryAddress, returnAddress, width, length);
        this.height = height;
        this.count = count;
    }
    public double getHeight() {
        return height;
    }
    public int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+getWidth()+" x "+getLength()+" x "+height;
    }
}