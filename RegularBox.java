public class RegularBox extends Box {
    private String items;
    private double weight;

    public RegularBox() {
        super();
        this.items = "";
        this.weight = 0.0;
    }
    public RegularBox (String deliveryAddress, String returnAddress, double width, double length, double height, int count, String items, double weight) {
        super(deliveryAddress, returnAddress, width, length, height, count);
        this.items = items;
        this.weight = weight;
    }
    public String getItems() {
        return items;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+"Items: "+getItems()+" \n"+"Count: "+getCount()+" \n"+"Weight: "+getWeight();
    }
}