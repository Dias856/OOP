public class Property {

    private int id;
    private String address;
    private double price;
    private boolean available;


    public Property(int id, String address, double price, boolean available) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Price:" + price);
        System.out.println("Available: " + available);
        System.out.println(" ");
    }
}
