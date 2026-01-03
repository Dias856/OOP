import java.util.Objects;

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

    @Override
    public String toString() {
        return id + " | " + address + " | $" + price + " | available=" + available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return id == property.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

