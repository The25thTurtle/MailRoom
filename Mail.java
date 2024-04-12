public abstract class Mail {
    private String deliveryAddress;
    private String returnAddress;
    private double width;
    private double length;
    private int id;
    private static int nextId = 0;

    public Mail () {
        this.deliveryAddress = "";
        this.returnAddress  = "";
        this.width = 0.0;
        this.length = 0.0;
        this.id = nextId;
        nextId++;
    }
    public Mail (String deliveryAddress, String returnAddress, double width, double length) {
        this.deliveryAddress = deliveryAddress;
        this.returnAddress = returnAddress;
        this.width = width;
        this.length = length;
        this.id = nextId;
        nextId++;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public String getReturnAddress() {
        return returnAddress;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return +id+"\n"+deliveryAddress+"\n"+returnAddress;
    }
}